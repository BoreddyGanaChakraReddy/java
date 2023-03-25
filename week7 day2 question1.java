import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        String output = words[0] + "$" + words[1];
        String lowerCaseString = output.toLowerCase();
        System.out.println(lowerCaseString);
    }
}
