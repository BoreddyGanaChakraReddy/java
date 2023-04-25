import java.util.Arrays;
import java.util.Scanner;

public class StringSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Invalid");
            System.exit(0);
        }

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr);

        for (String s : arr) {
            System.out.println(s);
        }

        sc.close();
    }
}
