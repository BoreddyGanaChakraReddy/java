import java.util.Scanner;

public class StringIntCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.next();
        }
        int stringCount = 0;
        int integerCount = 0;
        for (String element : array) {
            try {
                Integer.parseInt(element);
                integerCount++;
            } catch (NumberFormatException e) {
                stringCount++;
            }
        }
        System.out.println(integerCount);
        System.out.println(stringCount);
    }
}
