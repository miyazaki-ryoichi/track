import java.util.Scanner;
public class Reidai0305_Main {
  public static void main(String[] args) {
    // ここに実装してください
    //EXERCISE_BEGIN_EDIT
    double jissu1, jissu2;
    double seki, sho;
    Scanner sc = new Scanner(System.in);

    System.out.print("jissu1 = ");
    jissu1 = sc.nextDouble();
    System.out.print("jissu2 = ");
    jissu2 = sc.nextDouble();
    seki = jissu1 * jissu2;
    sho = jissu1 / jissu2;
    System.out.println("jissu1 と jissu2 の積は " + seki);
    System.out.println("jissu1 と jissu2 で割った商は " + sho);

    sc.close();
    //EXERCISE_END_EDIT
  }
}