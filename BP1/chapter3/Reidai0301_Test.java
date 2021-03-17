import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Reidai0301_Test {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        String answer = "5\n3\n8\n";
        String result = "";
        boolean success = false;

        try {
            Reidai0301_Main.main(new String[0]);
            result = out.toString();

            if (answer.equals(result)) {
                success = true;
            }
        } finally {
            System.setOut(stdout);
            if (success) {
                System.out.println("ok 正解!");
            } else {
                System.out.println(String.format("not ok 1 配列の1番目の値を出力する\n出力は\n%sでした。期待される出力は\n%sです。", result, answer));
            }
        }
    }
}
