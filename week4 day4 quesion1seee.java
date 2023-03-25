import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []ar=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
            count+=ar[i];
        }
        System.out.println(count);
    }
}
