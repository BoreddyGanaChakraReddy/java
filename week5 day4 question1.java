import java.io.*;
import java.util.*;

public class FactorialCalculator {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number=in.nextInt(); 
        int factorial = factorial(number);
        System.out.println(factorial);
    }
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
