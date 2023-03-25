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
        int i;
        float a[]=new float[5];
        int b[]=new int[5];
for(i=0;i<n;i++)
{
  a[i]=obj.nextFloat(); 
}
        
for(i=0;i<n;i++)
{
    if(a[i]<0)
    {
        System.out.println("Invalid Array Elements");
        return;
    }
    else
    {
            b[i]=(int)a[i]; 
    }

}
        for(i=0;i<n;i++)
            System.out.println(b[i]);
} 
       
}
