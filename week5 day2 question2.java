import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        double area = 0;
     Scanner scan = new Scanner(System.in);
     //   System.out.println("Enter how many values you want ot enter: ");
     int num = scan.nextInt();
     if (num>1) {
         double[] arr = new double[num];
     //    System.out.println("Enter the values here: ");
         for (int i = 0; i < num; i++) {
             arr[i] = scan.nextDouble();
         }
         for (int i = 0; i < num; i++)
         {
              area = (3.14) * (arr[i] * arr[i]);
             arr[i] = area;
         }
       //  System.out.println("The Area of the circles are: ");
         for (int i = 0; i < num; i++)
         {
             if (arr[i]>30)
             {
                 System.out.println(String.format("%.4f",arr[i]));
             }
         }
     }
     else
     {
         System.out.println("Invalid Input");
     }    }
}
