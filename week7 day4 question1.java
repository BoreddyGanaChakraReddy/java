import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean result = isPalindromePossible(str);
        System.out.println(result);
    }
    
    public static boolean isPalindromePossible(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                // check if removing character at index i or j makes it a palindrome
                return isPalindrome(str, i + 1, j) || isPalindrome(str, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }
    
    public static boolean isPalindrome(String str, int i, int j) {
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
