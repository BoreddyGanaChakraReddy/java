import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Main
{
  public static void main(String[] args) 
  {
    Scanner obj= new Scanner(System.in);
    double a = obj.nextDouble();
    if (a >= 0) 
    {
      System.out.println((int)a);
    } 
      else
      {
      System.out.println("Invalid Input");
    }
  }
}
