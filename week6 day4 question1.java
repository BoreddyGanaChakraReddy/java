import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] marks = new double[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextDouble();
            }
        }
        double[] averages = average_marks(marks);
        for (double avg : averages) {
            System.out.print(avg + " ");
        }
    }
    public static double[] average_marks(double[][] marks) {
        double[] averages = new double[marks.length];
        for (int i = 0; i < marks.length; i++) {
            Arrays.sort(marks[i]);
            double sum = marks[i][1] + marks[i][2];
            averages[i] = sum / 2.0;
        }
        return averages;
    }
}
