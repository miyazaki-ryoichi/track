import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Rensyu0202_Test {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        String answer = "　　　　　　プ\n　　　　　プロ\n　　　　プログ\n　　　プログラ\n　　プログラミ\n　プログラミン\nプログラミング\n";
        String result = "";
        boolean success = false;

        try {
            Rensyu0202_Main.main(new String[0]);
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
