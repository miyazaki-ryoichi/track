import java.util.Scanner;
public class Rensyu0302_Main {
  public static void main(String[] args) {
    // ここに実装してください
    //EXERCISE_BEGIN_EDIT
      int hen1, hen2, menseki;
      Scanner sc = new Scanner(System.in);

      hen1 = sc.nextInt();
      hen2 = sc.nextInt();

      menseki = hen1 * hen2;
      System.out.println(menseki);

      sc.close();
    //EXERCISE_END_EDIT
  }
}