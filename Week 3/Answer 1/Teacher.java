import java.util.*;

public class Teacher extends Student {
    private static Scanner sc = new Scanner(System.in);
    private String name, areaOfTeaching;

    Teacher() {
        System.out.println("Creating a teacher object");
    }

    void takeInput() {
        System.out.println("Enter teacher name:");
        name = sc.nextLine();
        System.out.println("Enter teacher's area of teaching:");
        areaOfTeaching = sc.nextLine();        
    }

    void display() {
        System.out.println("Teacher name is " + name);
        System.out.println("Teacher's area of teaching is " + areaOfTeaching);
    }
    
    static abstract class Stream {
        ArrayList<Student> students = new ArrayList<Student>();
        void takeInput() {
            int c = 1;
            do {
                Student s = new Student();
                s.takeInput();
                students.add(s);
                System.out.println("Press 1 if you want to add more students, else any other digit");
                c = sc.nextInt();
            } while(c==1);
        }
        
        void display() {
            for(Student s: students) {
                s.display();
            }
        }
    }

    static class Commerce extends Stream {
        
        void takeInput() {
            System.out.println("Adding students to Commerce stream");
            super.takeInput();
        }
        
        void display() {
            System.out.println("Displaying students of Commerce stream");
            super.display();
        }
    }

    static class Science extends Stream {
        
        void takeInput() {
            System.out.println("Adding students to Science stream");
            super.takeInput();
        }
        
        void display() {
            System.out.println("Displaying students of Science stream");
            super.display();
        }
    }

    static class Arts extends Stream {
        
        void takeInput() {
            System.out.println("Adding students to Arts stream");
            super.takeInput();
        }
        
        void display() {
            System.out.println("Displaying students of Arts stream");
            super.display();
        }
    }
}
