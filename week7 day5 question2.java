import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String statement = scanner.nextLine();
        int n = scanner.nextInt();
        if (n < 1 || n > 10) {
            System.out.println("Invalid Input");
            return;
        }
        String[] words = statement.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.length() == n) {
                count++;
            }
        }
        System.out.println(count);
    }
}
