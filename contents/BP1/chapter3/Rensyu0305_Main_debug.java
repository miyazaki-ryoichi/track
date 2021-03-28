import java.util.Scanner;
public class Rensyu0305_Main {
  public static void main(String[] args) {
    // ここに実装してください
    //EXERCISE_BEGIN_EDIT
      int a, b, c;
      Scanner sc = new Scanner(System.in);

      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      System.out.println((2*(a*b+b*c+c*a)) + ", " + (a*b*c));

      sc.close();
    //EXERCISE_END_EDIT
  }
}