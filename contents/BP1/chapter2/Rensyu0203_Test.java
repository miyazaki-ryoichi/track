import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Rensyu0203_Test {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        String answer = "9\n9が答です\n答は27\n16\n答は16\n1\n答は1\n26\n答は620\n70\n答は70\n2\n答は2\n2.5\n答は2.5\n4.4\n答は1.23.2\n5.4\n答は14.4\n5.9\n答は1.54.4\n";
        String result = "";
        boolean success = false;

        try {
            Rensyu0203_Main.main(new String[0]);
            result = out.toString();

            if (answer.equals(result)) {
                success = true;
            }
        } finally {
            System.setOut(stdout);
            if (success) {
                System.out.println("ok 1 正解!");
            } else {
                System.out.println(String.format("not ok 1 不備あり\n出力は\n%s\nでした。\n\n期待される出力は\n%sです。\n", result, answer));
            }
        }
    }
}
