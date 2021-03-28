import java.util.Scanner;
public class Rensyu0307_Main {
  public static void main(String[] args) {
    // ここに実装してください
    //EXERCISE_BEGIN_EDIT
      int num;
      Scanner sc = new Scanner(System.in);

      num = sc.nextInt();

      System.out.println(num/10+", "+num%10);

      sc.close();
    //EXERCISE_END_EDIT
  }
}