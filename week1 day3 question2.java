import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */{
        Scanner sc= new Scanner(System.in);
        int N =sc.nextInt();
        
        for (int i = 0; i <= N; i++) {
     
            int cube;
            cube = i * i * i;
            if (cube == N) {
                System.out.println("Perfect Cube");
                return;
            }
            else if (cube > N) {
                System.out.println("Not Perfect Cube");
                return;
            }
        }
     }
   }
}
