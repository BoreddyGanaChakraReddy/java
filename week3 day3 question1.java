import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int A = obj.nextInt();
        
        int[] notes = {2000, 500, 200, 100};
        int[] noteCounter = new int[4];
        
        if (A >= 100 && A <= 20000 && A % 100 == 0)
        {
            for (int i = 0; i < 4; i++)
            {
                if (A >= notes[i])
                {
                    noteCounter[i] = A / notes[i];
                    A = A - noteCounter[i] * notes[i];
                }
            }
            
            for (int i = 3; i >= 0; i--)
            {
                if (noteCounter[i] != 0)
                {
                    System.out.println(noteCounter[i] + " " + notes[i] + " Notes");
                }
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }

    }
}
