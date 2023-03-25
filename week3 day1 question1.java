import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
    Scanner obj=new Scanner(System.in);
    String s=obj.nextLine();    
    char c=obj.next().charAt(0);
    int a=0;
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)==c)    
        a++;
    }
        System.out.println(a);
        
    }
}
