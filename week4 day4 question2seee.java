import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String days=sc.next();
        switch(days)
        {
            case "Monday":
                System.out.println("8:30 5:30");
                break;
            case "Tuesday":
                System.out.println("8:30 5:30");
                break;
            case "Wednesday":
                System.out.println("8:30 5:30");
                break;
            case "Thrusday":
                System.out.println("8:30 5:30");
                break;
            case "Friday":
                System.out.println("8:30 5:30");
                break;
            case "Saturday":
                System.out.println("9:30 4:30");
                break;
            default:
                System.out.println("Library is closed");
                break;
        }
    }
}
