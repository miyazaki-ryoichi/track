import java.util.Scanner;
public class Reidai0404_Main {
  public static void main(String[] args) {
    // ここに実装してください
    EXERCISE_BEGIN_EDIT
    double a, b, c, D;
    double x1, x2;
    Scanner sc = new Scanner(System.in);

    System.out.println("方程式 ax^2 + bx + c = 0 の a b c を入力してください");
    System.out.print("a = ");
    a = sc.nextDouble();
    System.out.print("b = ");
    b = sc.nextDouble();
    System.out.print("c = ");
    c = sc.nextDouble();
    
    D = b * b - 4 * a * c;

    if (D == 0){       //重解の場合
        x1 = -b / (2 * a);
        System.out.println("解は重解で " + x1);
    }
    else if (D > 0){   //実数解が二つの場合               
        x1 = (-b  + Math.sqrt(D)) / (2 * a);
        x2 = (-b - Math.sqrt(D)) / (2 * a);
        System.out.println("解は " + x1 + "と" + x2);
    }
    else{              //実数解がない場合
        System.out.println("実数解はありません");
    }
    sc.close();
    EXERCISE_END_EDIT
  }
}