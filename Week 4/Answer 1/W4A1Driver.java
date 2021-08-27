import MCA.Student;

public class W4A1Driver {
    public static void main(String[] args) {
        int[] marks = {100, 97, 89};
        Student s = new Student("John Doe", 21, marks);
        s.display();
        System.out.println("Total marks are: " + s.getTotalMarks());
        System.out.println("Total percentage is: " + s.getTotalPercentage());
    }
}

// Output

// The student, John Doe, roll number 21, has the following scores:
// 100
// 97
// 89
// Total marks are: 286
// Total percentage is: 95.33333333333333
