import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 //System.out.print("Enter two digit number: ");
 sc.next();
 sc.next();
 sc.next();
 sc.next();
 int n=sc.nextInt();
 int o=n;
 int i=0;
 int sum=0,pro=1,m,p;
 //int ar[]=new int[2];
 while((n>0))
 {
 m=n%10;
 p=m;
 pro=pro*m;
 sum+=m;
 n=n/10;
 i++;
 }
 //System.out.println(sum+" "+pro);
     if((sum+pro)==o)
 {
     System.out.println("Special two digit number");
     }
 else if(n<10)
 {
 System.out.println("Invalid Input");
 }
 else{
 System.out.println("Not a Special two digit number");

 }
 }
}
