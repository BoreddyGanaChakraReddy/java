import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean result = check(n);

        if (result) {
            System.out.println("True");
        } 
    }

    public static boolean check(int n) {
        if (n < 20 || n > 400) {
            System.out.println("Invalid Input");
            return false;
        }

        if (n % 2 == 0 && n % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
