import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

// 標準入力の入力元を変更
class MyInputStream extends InputStream {
    // 標準入出力のオブジェクトを退避
    InputStream orgIn = System.in;
    PrintStream orgOut = System.out;
    PrintStream orgErr = System.err;
    
    private StringBuilder sb = new StringBuilder();

    // 標準入力したい文字を登録。nextLineに対応するため改行を付与。
    public void typeLine(String str){
        sb.append(str).append(System.getProperty("line.separator"));
    }

    // InputStreamの仕様上readメソッドの実装の必要あり
    @Override
    public int read() {
        if (sb.length() == 0) {
            return -1; // ストリームの終わり
        }
        int result = sb.charAt(0); // 次に読み込むバイト値
        sb.deleteCharAt(0); // 読み込んだので削除
        return result;
    }
}

public class Rensyu0401_Test {
    public static void doTest(int index, String a) {
        
        MyInputStream myIn = new MyInputStream();
        System.setIn(myIn); // 自作の標準入力オブジェクトをセット
        myIn.typeLine(a); // 標準入力に相当する操作
        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));

        int seisu1 = Integer.parseInt(a);
       
        String answer;

        if (seisu1 < 0){       //重解の場合
            answer="マイナスの数です\n";
        }
        else if (seisu1 > 0){   //実数解が二つの場合               
            answer="プラスの数です\n";
        }
        else{
            answer="";
        }

        String result = "";
        boolean success = false;

        try {
            Rensyu0401_Main.main(new String[0]);
            result = out.toString();

            if (answer.equals(result)) {
                success = true;
            }
        } finally {
            System.setOut(stdout);
            if (success) {
                //System.out.print(String.format("出力>>\n%s", answer));
                System.out.println(String.format("ok %d 正解!\n", index));
            } else {
                System.out.println(String.format("not ok %d 不備あり\n出力は\n%sでした。\n\n期待される出力は\n%sです。\n", index, result, answer));
            }
        }
    }

    public static void main(String[] args) {
        doTest(1, "5");
        doTest(2, "-3");
        doTest(3, "0");
    }
}
