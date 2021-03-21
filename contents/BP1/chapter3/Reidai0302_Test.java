import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Reidai0302_Test {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(out));

        int seisu1, seisu2;
        seisu1 = 23;
        seisu2 = 7;
        
        String answer = "seius1 = " + seisu1 + "\n" +
                        "seius2 = " + seisu2 + "\n" +
                        "seius1 + seisu2 = " +  seisu1+seisu2  + "\n" +
                        "seius1 + seisu2 = " + (seisu1+seisu2) + "\n" +
                        "seius1 * seisu2 = " + (seisu1*seisu2) + "\n" +
                        "seius1 / seisu2 = " + (seisu1/seisu2) + "\n" +
                        "seius1 % seisu2 = " + (seisu1%seisu2) + "\n";
        
        String result = "";
        boolean success = false;

        try {
            Reidai0302_Main.main(new String[0]);
            result = out.toString();

            if (answer.equals(result)) {
                success = true;
            }
        } finally {
            System.setOut(stdout);
            if (success) {
                System.out.println("ok 1 文字列と整数型変数の中身の出力 正解!\n");
            } else {
                System.out.println(String.format("not ok 1 不備あり\n出力は\n%sでした。\n\n期待される出力は\n%sです。\n", result, answer));
            }
        }
    }
}
