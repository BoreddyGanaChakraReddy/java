import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
int a[]=new int[7];
for(int i=0;i<n;i++)
{
int s=0;
for(int j=0;j<7;j++)
{
a[j]=obj.nextInt();
s=s+a[j];
}
if(s==56)
{
 System.out.println("1") ;  
}
else
{
System.out.println("0") ;  

}}
} 
}
