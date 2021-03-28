import java.util.Scanner;
public class Rensyu0402_Main {
  public static void main(String[] args) {
    // ここに実装してください
    EXERCISE_BEGIN_EDIT
    int n;
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    
    if (n < 0){
        System.out.println(-n);
    }
    else{
        System.out.println(n);
    }
    sc.close();
    EXERCISE_END_EDIT
  }
}