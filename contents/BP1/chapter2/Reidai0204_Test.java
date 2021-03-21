import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Reidai0204_Test {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        String answer = "ab\ncd\n";
        String result = "";
        boolean success = false;

        try {
            Reidai0204_Main.main(new String[0]);
            result = out.toString();

            if (answer.equals(result)) {
                success = true;
            }
        } finally {
            System.setOut(stdout);
            if (success) {
                System.out.println("ok 1 文字の出力 正解!");
            } else {
                System.out.println(String.format("not ok 1 不備あり\n出力は\n%sでした。\n\n期待される出力は\n%sです。\n", result, answer));
            }
        }
    }
}
