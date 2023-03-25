import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;//import java.util.*;


public class Solution {

    public static void main(String[] args) {
        int X,Y;
        Scanner input=new Scanner(System.in);
        X=input.nextInt();
        Y=input.nextInt();
        if(X>0 && Y>0)
        {
            System.out.print(X+"-"+Y);
        }
        else
            System.out.print("Invalid Input");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
