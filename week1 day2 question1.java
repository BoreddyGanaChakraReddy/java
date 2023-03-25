import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
public class Solution {

 public static void main(String[] args) {
 Scanner obj=new Scanner(System.in);
 int N=obj.nextInt(),count=0;
 for(int i=1;i<=N;i++)
 {
 if(N%i==0)
 {
 count++;
 }
 }
 if(count==2)
 System.out.println("Prime Number");
 else 
 System.out.println("Not Prime Number");
 

 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 }
}
