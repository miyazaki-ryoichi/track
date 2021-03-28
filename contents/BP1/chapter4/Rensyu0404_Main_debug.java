import java.util.Scanner;
public class Rensyu0404_Main {
  public static void main(String[] args) {
    // ここに実装してください
    EXERCISE_BEGIN_EDIT
    int a, b;
    Scanner sc = new Scanner(System.in);

    a = sc.nextInt();
    b = sc.nextInt();
    
    if (a%b == 0){
        System.out.println("a is a multiple of b");
    }
    else{
        System.out.println("a is not a multiple of b");
    }
    sc.close();
    EXERCISE_END_EDIT
  }
}