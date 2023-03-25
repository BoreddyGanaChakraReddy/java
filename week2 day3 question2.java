import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int classesHeld = sc.nextInt();
        int classesAttended = sc.nextInt();
        sc.close();

        int attendancePercentage = (classesAttended * 100) / classesHeld;
        System.out.println(attendancePercentage);

        if (attendancePercentage >= 75) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
