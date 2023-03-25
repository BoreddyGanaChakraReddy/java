import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
if((x==0)||(y==0)||(z==0))
{
System.out.println("Invalid Input");
}
else
{
int a=x*10;
a=a/100;
x=x-a;
int b=y*20;
b=b/100;
y=y-b;
int c=z*30;
c=c/100;
z=z-c;
if(x!=9000)
System.out.println((x+(2*y)+(3*z)));
else
System.out.println(x-(8*a)+(2*(y-(3*b)))+(3*(z-(4*c/3))));
}
}
}
