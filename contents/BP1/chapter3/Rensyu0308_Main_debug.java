import java.util.Scanner;
public class Rensyu0308_Main {
  public static void main(String[] args) {
    // ここに実装してください
    //EXERCISE_BEGIN_EDIT
      int num;
      int a, b, c, d, e, f;
      Scanner sc = new Scanner(System.in);

      num = sc.nextInt();
      a = num/500;
      num=num%500;
      
      b = num/100;
      num=num%100;

      c = num/50;
      num=num%50;

      d = num/10;
      num=num%10;

      e = num/5;
      num=num%5;

      f = num;

      System.out.println(a+", "+b+", "+c+", "+d+", "+e+", "+f);
      
      sc.close();
    //EXERCISE_END_EDIT
  }
}