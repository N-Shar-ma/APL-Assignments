package MCA;

public class Student {
    String name;
    int rollNo;
    int[] marks;

    public Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void display() {
        System.out.println("The student, " + name + ", roll number " + rollNo + ", has the following scores:");
        for (int mark : marks) {
            System.out.println(mark);
        }
    }

    public int getTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double getTotalPercentage() { // marks are assumed to be upon 100
        return getTotalMarks()/(double)marks.length;
    }
}
