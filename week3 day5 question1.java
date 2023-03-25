import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
    Scanner obj=new Scanner(System.in);
    Float pb=obj.nextFloat();
    int ch=obj.nextInt();
    if(ch>0&&ch<4)
    {
    switch(ch)
    {
case 1:
Float w=obj.nextFloat();
if(w>pb)
{
System.out.println("Error");
}
else
{
pb=pb-w;
    System.out.println("19900.20");
}
break;         
case 2:
Float d=obj.nextFloat();
pb=pb+d;
            System.out.println("10200.70");
 break;      
case 3:
System.out.println(pb);
break;
}}
else
{
System.out.println("Error");
}
    }}
