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
        int a[]=new int[10];
        int i,j,temp;
        if(n<0)
        {
                    System.out.println("Invalid Array Size");
        }
        else{
        for(i=0;i<n;i++)
        {
        a[i]=obj.nextInt();}
        if(a[i]<0)
        {
        System.out.println("Invalid Array Elements.");
        }
        else{
        for(i=0;i<n;i++)
        {
        for(j=0;j<n-1-i;j++)
        {
            if(a[j]>a[j+1])
            {
               temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        }
        System.out.println(a[n-2]);}
    }}
}
