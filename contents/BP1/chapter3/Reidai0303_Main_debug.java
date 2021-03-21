import java.util.Scanner;
public class Reidai0303_Main {
  public static void main(String[] args) {
    // ここに実装してください
    //EXERCISE_BEGIN_EDIT
    String namae, jusho;
    Scanner sc = new Scanner(System.in);

    System.out.print("あなたの名前を入力してください>> ");
    namae = sc.next();
    System.out.println("あなたの名前は " + namae + " さんですね");

    System.out.print("あなたの住所を入力してください>> ");
    jusho = sc.next();
    System.out.println("あなたの住所は " + jusho + " で間違いないですか");
    
    sc.close();
    //EXERCISE_END_EDIT
  }
}