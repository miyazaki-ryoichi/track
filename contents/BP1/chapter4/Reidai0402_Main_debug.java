import java.util.Scanner;
public class Reidai0402_Main {
  public static void main(String[] args) {
    // ここに実装してください
    int seisu;
    Scanner sc = new Scanner(System.in);

    System.out.print("整数を入力してください>> ");
    seisu = sc.nextInt();
    if ((seisu % 3 == 0) || (seisu % 7 == 0)){       //条件が「または」
        System.out.println("3 か 7 の倍数");
    }
    else{                  
        System.out.println("3 でも 7 でも割り切れません");
    }
    sc.close();
    EXERCISE_END_EDIT
  }
}