import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        if (n <= 1) {
            System.out.println("Invalid");
            return;
        }
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            strings.add(scanner.nextLine());
        }
        Predicate<String> endsWithG = s -> s.endsWith("g");
        List<String> filteredStrings = new ArrayList<>();
        for (String s : strings) {
            if (endsWithG.test(s)) {
                filteredStrings.add(s);
            }
        }
        for (String s : filteredStrings) {
            System.out.println(s);
        }
    }
}
