public class Reidai0401_Main {
  public static void main(String[] args) {
    // ここに実装してください
    EXERCISE_BEGIN_EDIT
    int seisu;
    Scanner sc = new Scanner(System.in);

    System.out.print("整数を入力してください>> ");
    seisu = sc.nextInt();
    if (seisu % 2 == 1){       //2 で割った余りが 1 だった
        System.out.println(seisu + "は奇数です");
    }
    else{                     //2 で割った余りがそれ以外だった
        System.out.println(seisu + "は偶数です");
    }
    sc.close();
    EXERCISE_END_EDIT
  }
}