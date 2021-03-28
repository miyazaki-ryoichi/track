import java.util.Scanner;
public class Reidai0306_Main {
  public static void main(String[] args) {
    // ここに実装してください
    //EXERCISE_BEGIN_EDIT
      int hen, menseki;
      Scanner sc = new Scanner(System.in);

      System.out.print("正方形の一辺の長さ>> ");
      hen = sc.nextInt();

      menseki = hen * hen;
      System.out.println("正方形の面積は " + menseki + " です");

      sc.close();
    //EXERCISE_END_EDIT
  }
}