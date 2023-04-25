import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= 10 && a <= 1000 && b >= 10 && b <= 1000) {
            System.out.println(isBigger(a, b));
        } else {
            System.out.println("Invalid Input");
        }
    }

    public static boolean isBigger(int a, int b) {
        return a > b;
    }
}
