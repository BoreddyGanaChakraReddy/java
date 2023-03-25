import java.util.Scanner;

class Integer1 {
    private int[] arr;

    public Integer1(int[] arr) {
        this.arr = arr;
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int multiplication() {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid Array Size");
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int choice = sc.nextInt();
        Integer1 obj = new Integer1(arr);
        switch (choice) {
            case 1:
                System.out.println(obj.sum());
                break;
            case 2:
                System.out.println(obj.multiplication());
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}
