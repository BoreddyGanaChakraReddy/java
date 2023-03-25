import java.util.Scanner;

class Student {
    private String name;
    private int registrationNo;

    public Student() {
        this.name = null;
        this.registrationNo = 0;
    }

    public void show() {
        System.out.println(this.name + "," + this.registrationNo);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegistrationNo(int registrationNo) {
        this.registrationNo = registrationNo;
    }
}

public class Main {
    public static void main(String... vamsi) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                String name = sc.next();
                int registrationNo = sc.nextInt();
                while(registrationNo < 0) {
                    System.out.println("Registration number should be positive. Enter again:");
                    registrationNo = sc.nextInt();
                }
                s.setName(name);
                s.setRegistrationNo(registrationNo);
                s.show();
                break;
            case 2:
                s.show();
                break;
            default:
                System.out.println("Wrong Choice");
        }
        sc.close();
    }
}
