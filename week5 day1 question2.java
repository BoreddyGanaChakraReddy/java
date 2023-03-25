import java.util.*;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if(n<5||n>15){
               System.out.println("Invalid");
        }
        else{
        int[] arr = new int[n];
       
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int choice = sc.nextInt();
        if (choice == 1) {
            Arrays.sort(arr);
            
            for (int i = 0; i < n; i++) {
                if (i == 0 || arr[i] != arr[i - 1]) {
                    System.out.print(arr[i] + " ");
                }
            }
        } else if (choice == 2) {
            Arrays.sort(arr);
           
            for (int i = n - 1; i >= 0; i--) {
                if (i == n - 1 || arr[i] != arr[i + 1]) {
                    System.out.print(arr[i] + " ");
                }
            }
        } 
    }
}
}
