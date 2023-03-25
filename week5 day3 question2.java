import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int empId = sc.nextInt();
String name = sc.next();
String designation = sc.next();

if(empId > 201) {
int salary = 20000 + 1000;
System.out.println(name + " " + empId + " " + salary + "INR");
} else {
System.out.println("No Appraisal");
}

sc.close();
}
}
