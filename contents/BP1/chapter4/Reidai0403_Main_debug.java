import java.util.Scanner;
public class Reidai0403_Main {
  public static void main(String[] args) {
    // ここに実装してください
    EXERCISE_BEGIN_EDIT
    int seisu1, seisu2;
    Scanner sc = new Scanner(System.in);

    System.out.print("整数 1 を入力してください>> ");
    seisu1 = sc.nextInt();
    System.out.print("整数 2 を入力してください>> ");
    seisu2 = sc.nextInt();
    if (Math.abs(seisu1) > Math.abs(seisu2)){       //条件が「または」
        System.out.println("|" + seisu1 +  "| > |" + seisu2 + "|");
    }
    else if (Math.abs(seisu1) < Math.abs(seisu2) ){                  
        System.out.println("|" + seisu1 + "| < |" + seisu2 + "|");
    }
    else{
        System.out.println("|" + seisu1 + "| = |" + seisu2 + "|");
    }
    sc.close();
    EXERCISE_END_EDIT
  }
}