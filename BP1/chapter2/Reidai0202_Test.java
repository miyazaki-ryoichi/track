import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Reidai0202_Test {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        String answer = "18\n6\n17\n18\n4\n2\n2.6666666666666665\n2.6999999999999997\n2.5312499999999996\n24.0\n3.1\n3.7666666666666666\n";
        String result = "";
        boolean success = false;

        try {
            Reidai0202_Main.main(new String[0]);
            result = out.toString();

            if (answer.equals(result)) {
                success = true;
            }
        } finally {
            System.setOut(stdout);
            if (success) {
                System.out.println("ok 1 数値の出力 正解!");
            } else {
                System.out.println(String.format("not ok 1 出力は\n%s\nでした。期待される出力は\n%s\nです。", result, answer));
            }
        }
    }
}
