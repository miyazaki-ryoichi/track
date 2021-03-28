import java.util.Scanner;
public class Rensyu0403_Main {
  public static void main(String[] args) {
    // ここに実装してください
    EXERCISE_BEGIN_EDIT
    int m, n;
    Scanner sc = new Scanner(System.in);

    m = sc.nextInt();
    n = sc.nextInt();
    
    if (m == n){
        System.out.println("same");
    }
    else{
        System.out.println("different");
    }
    sc.close();
    EXERCISE_END_EDIT
  }
}