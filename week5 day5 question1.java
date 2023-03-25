import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) 
    {
        Scanner n=new Scanner(System.in);
        int x=n.nextInt();
        int a[]=new int[x];
        int sum=0;
        if(x>7)
        {
            System.out.println("Invalid");
            System.exit(0);
        }
        for(int i=0; i<x; i++)
            a[i]=n.nextInt();
        for(int i=0; i<x; i++)
            sum+=a[i];
        int total=sum/x;
        if(total>90) System.out.println("A+");
        else if(total>=70 && total<=89) System.out.println("A");
        else if(total>=60 && total<=69) System.out.println("B");
        else if(total>=50 && total<=59) System.out.println("C");
        else if(total<=49) System.out.println("D");    
    }
}
