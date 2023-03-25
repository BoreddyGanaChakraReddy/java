import java.io.*;
import java.util.*;

class Student {
    private String name;

    public Student(Object name) {
        if (name instanceof String) {
            this.name = (String) name;
        } else {
            this.name = "Unknown";
        }
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Rahul");
        Student student2 = new Student(33);

        System.out.println(student1.getName());
        System.out.println(student2.getName());
    }
}
