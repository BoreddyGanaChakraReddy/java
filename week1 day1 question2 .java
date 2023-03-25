import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;//import java.util.*;
public class Solution {
       private static final DecimalFormat df = new DecimalFormat("0.0");
    public static void main(String[] args) {
        float a,b,c;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        float result=(a+b+c)/3;
        df.setRoundingMode(RoundingMode.DOWN);
        System.out.print(df.format(result));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
