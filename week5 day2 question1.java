import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
         Scanner scan = new Scanner(System.in);
       int[] arr1 = new int[2];
       int[] arr2 = new int[2];
       for (int i=0;i<2;i++)
       {
           arr1[i] = scan.nextInt();
       }
        for (int i=0;i<2;i++)
        {
            arr2[i] = scan.nextInt();
        }
        int real_part = (arr2[0]*arr1[0]-arr2[1]*arr1[1]);
        int complex_part = (arr2[1]*arr1[0]+arr2[0]*arr1[1]);
            System.out.print(real_part);
            System.out.print("+" + complex_part + "i");
}
}
