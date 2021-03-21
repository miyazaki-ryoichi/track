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

public class Reidai0404_Test {
    public static void doTest(int index, String a, String b, String c) {
        
        MyInputStream myIn = new MyInputStream();
        System.setIn(myIn); // 自作の標準入力オブジェクトをセット
        myIn.typeLine(a); // 標準入力に相当する操作
        myIn.typeLine(b); // 標準入力に相当する操作
        myIn.typeLine(c); // 標準入力に相当する操作

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));

        int seisu1 = Integer.parseInt(a);
        int seisu2 = Integer.parseInt(b);
        int seisu3 = Integer.parseInt(c);

        String answer;

        double D = seisu2 * seisu2 - 4 * seisu1 * seisu3;
        double x1, x2;

        if (D == 0){       //重解の場合
            x1 = -seisu2/ (2 * seisu1);
            answer="方程式 ax^2 + bx + c = 0 の a b c を入力してください\na = b = c = 解は重解で " + x1 + "\n";
        }
        else if (D > 0){   //実数解が二つの場合               
            x1 = (-seisu2 + Math.sqrt(D)) / (2 * seisu1);
            x2 = (-seisu2 - Math.sqrt(D)) / (2 * seisu1);
            answer="方程式 ax^2 + bx + c = 0 の a b c を入力してください\na = b = c = 解は " + x1 + " と " + x2 + "\n";
        }
        else{              //実数解がない場合
            answer="方程式 ax^2 + bx + c = 0 の a b c を入力してください\na = b = c = 実数解はありません\n";
        }

        String result = "";
        boolean success = false;

        try {
            Reidai0404_Main.main(new String[0]);
            result = out.toString();

            if (answer.equals(result)) {
                success = true;
            }
        } finally {
            System.setOut(stdout);
            if (success) {
                //System.out.print(String.format("出力>>\n%s", answer));
                System.out.println(String.format("ok %d 2次方程式の解 正解!\n", index));
            } else {
                System.out.println(String.format("not ok %d 不備あり\n出力は\n%sでした。\n\n期待される出力は\n%sです。\n", index, result, answer));
            }
        }
    }

    public static void main(String[] args) {
        doTest(1, "2", "4", "2");
        doTest(2, "1", "3", "3");
        doTest(3, "1", "2", "3");
    }
}
