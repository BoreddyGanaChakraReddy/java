import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{

public static void main(String[] args) 
{
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
float t=obj.nextFloat();
float m;
float j;
if(n==1)
{
j=(int)((t-32)*500/9);
System.out.println(j/100f);
}
else if(n==2)
{
m=(9*t)/5+32;
System.out.println(m);
}
else
{
System.out.println("INVALID CHOICE");
    
}
}
}
