import java.io.*;
import java.util.*;

public class Brackets
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        for(int i=0;i<=s1.length();i++)
        {
            if(s1.charAt(i)=='('||s1.charAt(i)=='{')
                System.out.print(s1.charAt(i));
            else
            {
                System.out.print(s2);
                for(int j=i;j<s1.length();j++)
                    System.out.print(s1.charAt(i));
                break;
            }
        }
    }
}
