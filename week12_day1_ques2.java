import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

class Student {
    String name;
    int rollNo;
    String department;

    public Student(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        if (n <= 1) {
            System.out.println("Invalid");
            return;
        }

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int rollNo = sc.nextInt();
            sc.nextLine();
            String department = sc.nextLine();
            students.add(new Student(name, rollNo, department));
        }

        Predicate<Student> isCSE = s -> s.department.equals("CSE");
        students.stream().filter(isCSE).forEach(s -> System.out.println(s.rollNo));
    }
}
