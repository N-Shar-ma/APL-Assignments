import java.util.Scanner;

public class Student {
    private Scanner sc = new Scanner(System.in);
    private String name;
    private int rollNo;
    private int phoneNo;

    Student() {
        System.out.println("Creating a student object");
    }
    
    void takeInput() {
        System.out.println("Enter student name:");
        name = sc.nextLine();
        System.out.println("Enter student roll number:");
        rollNo = sc.nextInt();
        System.out.println("Enter student phone number:");
        phoneNo = sc.nextInt();
    }

    void display() {
        System.out.println("Student name is " + name);
        System.out.println("Student roll number is " + rollNo);
        System.out.println("Student phone number is " + phoneNo);
    }
}