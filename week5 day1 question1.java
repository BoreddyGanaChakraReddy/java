import java.util.Scanner;

class Employee {
    int id;
    int age;
    
    Employee(int id, int age) {
        this.id = id;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n < 1 || n > 10) {
            System.out.println("Invalid input");
        } else {
            Employee[] employees = new Employee[n];
            for (int i = 0; i < n; i++) {
                int id = scanner.nextInt();
                int age = scanner.nextInt();
                if (id < 10 || id > 1000 || age < 18 || age > 50) {
                    System.out.println("Invalid data");
                    return;
                }
                employees[i] = new Employee(id, age);
            }
            
            for (Employee emp : employees) {
                if (emp.age < 30) {
                    System.out.println(emp.id + " " + emp.age);
                }
            }
        }
    }
}
