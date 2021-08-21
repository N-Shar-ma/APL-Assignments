public class W3a1Driver {
    public static void main(String[] args) {
        Staff guard = new Staff();
        guard.takeInput();
        guard.display();
        System.out.println("******************************");
        Teacher scienceTeacher = new Teacher();
        scienceTeacher.takeInput();
        scienceTeacher.display();
        System.out.println("******************************");
        Student s = new Student();
        s.takeInput();
        s.display();
        System.out.println("******************************");
        Teacher.Commerce com = new Teacher.Commerce();
        com.takeInput();
        com.display();
        System.out.println("******************************");
        Teacher.Science sci = new Teacher.Science();
        sci.takeInput();
        sci.display();
        System.out.println("******************************");
        Teacher.Arts art = new Teacher.Arts();
        art.takeInput();
        art.display();
        System.out.println("******************************");        
    }
}

// Output

// Creating a staff object
// Enter staff name:
// Ram
// Enter staff work:
// Guarding the school gate
// Staff name is Ram
// Staff work is Guarding the school gate
// ******************************
// Creating a teacher object
// Enter teacher name:
// Mrs Pandey
// Enter teacher's area of teaching:
// Physics
// Teacher name is Mrs Pandey
// Teacher's area of teaching is Physics
// ******************************
// Creating a student object
// Enter student name:
// Nehal Sharma
// Enter student roll number:
// 1  
// Enter student phone number:
// 1234567
// Student name is Nehal Sharma
// Student roll number is 1
// Student phone number is 1234567
// ******************************
// Adding students to Commerce stream
// Creating a student object
// Enter student name:
// c1
// Enter student roll number:
// 11
// Enter student phone number:
// 2345678
// Press 1 if you want to add more students, else any other digit
// 0
// Displaying students of Commerce stream
// Student name is c1
// Student roll number is 11
// Student phone number is 2345678
// ******************************
// Adding students to Science stream
// Creating a student object
// Enter student name:
// s1
// Enter student roll number:
// 22
// Enter student phone number:
// 3456789
// Press 1 if you want to add more students, else any other digit
// 1
// Creating a student object
// Enter student name:
// s2
// Enter student roll number:
// 33
// Enter student phone number:
// 4567890
// Press 1 if you want to add more students, else any other digit
// 0
// Displaying students of Science stream
// Student name is s1
// Student roll number is 22
// Student phone number is 3456789
// Student name is s2
// Student roll number is 33
// Student phone number is 4567890
// ******************************
// Adding students to Arts stream
// Creating a student object
// Enter student name:
// a1
// Enter student roll number:
// 44
// Enter student phone number:
// 7654321
// Press 1 if you want to add more students, else any other digit
// 0
// Displaying students of Arts stream
// Student name is a1
// Student roll number is 44
// Student phone number is 7654321
// ******************************
