import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Reidai0206_Test {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        String answer = "これはダブルクォートです\"\nこれは円記号です\\\n途中で改行\nしてみました\n0\t1\t2\n";
        //String answer = "これはダブルクォートです\"\n";
        String result = "";
        boolean success = false;

        try {
            Reidai0206_Main.main(new String[0]);
            result = out.toString();

            if (answer.equals(result)) {
                success = true;
            }
        } finally {
            System.setOut(stdout);
            if (success) {
                System.out.println("ok 1 文字列の出力 正解!");
            } else {
                System.out.println(String.format("not ok 1 出力は\n%s\nでした。期待される出力は\n%s\nです。", result, answer));
            }
        }
    }
}
