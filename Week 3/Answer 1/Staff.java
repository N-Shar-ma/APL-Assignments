import java.util.Scanner;

public class Staff extends Student {
    private Scanner sc = new Scanner(System.in);
    private String name, work;

    Staff() {
        System.out.println("Creating a staff object");
    }

    void takeInput() {
        System.out.println("Enter staff name:");
        name = sc.nextLine();
        System.out.println("Enter staff work:");
        work = sc.nextLine();        
    }

    void display() {
        System.out.println("Staff name is " + name);
        System.out.println("Staff work is " + work);
    }
}
