import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Rensyu0204_Test {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));
        String answer = 1+"\t"+2+"\t"+3+"\n"+4+"\t"+5+"\t"+6+"\n"+7+"\t"+8+"\t"+9+"\n";
        String result = "";
        boolean success = false;

        try {
            Rensyu0204_Main.main(new String[0]);
            result = out.toString();

            if (answer.equals(result)) {
                success = true;
            }
        } finally {
            System.setOut(stdout);
            if (success) {
                System.out.println("ok 1 文字列の出力 正解!");
            } else {
                System.out.println(String.format("not ok 1 不備あり\n出力は\n%s\nでした。\n\n期待される出力は\n%sです。\n", result, answer));
            }
        }
    }
}
