import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String paperCode = sc.nextLine();

    if (paperCode.length() != 7) {
      System.out.println("INVALID PAPER CODE");
      return;
    }

    int paperCodeInt = Integer.parseInt(paperCode, 2);
    if (paperCodeInt < 65 || paperCodeInt > 90) {
      System.out.println("INVALID PAPER CODE");
      return;
    }

    System.out.println((char) paperCodeInt);
  }
}
