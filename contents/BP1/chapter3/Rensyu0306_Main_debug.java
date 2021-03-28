import java.util.Scanner;
public class Rensyu0306_Main {
  public static void main(String[] args) {
    // ここに実装してください
    //EXERCISE_BEGIN_EDIT
      int zyoutei, katei, takasa;
      Scanner sc = new Scanner(System.in);


      zyoutei = sc.nextInt();
      katei   = sc.nextInt();
      takasa = sc.nextInt();


      System.out.println((zyoutei+katei)*takasa/2.0);

      sc.close();
    //EXERCISE_END_EDIT
  }
}