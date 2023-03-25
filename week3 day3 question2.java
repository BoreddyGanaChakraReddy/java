import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner obj = new Scanner(System.in);
        int A = obj.nextInt();
        int N = obj.nextInt();
        
        switch (N) {
      case 1:
        if (A % 2 == 0) {
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
        break;
      case 2:
        if (A % 2 != 0) {
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
        break;
      case 3:
        if (A == 3) {
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
        break;
      case 4:
        System.out.println(120);
        break;
    }
  }        
}
