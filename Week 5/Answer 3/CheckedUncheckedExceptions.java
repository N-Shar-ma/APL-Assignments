import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CheckedUncheckedExceptions {
    static void checked(String file) throws Exception {
        FileReader fr = new FileReader(file); // handled by calling method (file is actually a directory)
        try {
            System.out.println("Trying to read first character from file");
            System.out.println("The int equivalent for 1st character read is: " + fr.read());
        } catch (Exception e) { // IO exception
            System.out.println(e);
        } finally {
            fr.close();
        }
        FileWriter fw = new FileWriter(file); // handled by calling method (file is actually a directory)
        try {
            System.out.println("Trying to write\'hi\' to file");
            fw.write("hi");
        } catch (Exception e) { // read only file
            System.out.println(e);
        } finally {
            fw.close();
        }
    }

    static void unchecked(int dividend, int divisor) {
        int inp = dividend/divisor; // causes exception if divisor is 0
        Scanner sc = new Scanner(System.in);
        sc.close();
        inp = inp + sc.nextInt(); // causes exception if divisor is not 0
    }
    
    public static void main(String[] args) throws IOException {
        String fileName = "Week 5/Answer 3/thisfileexists.txt";   
        File myFile = new File(fileName);
        myFile.createNewFile(); 
        myFile.setReadOnly();
        try {
            System.out.println("trying to divide by zero");
            unchecked(15,0);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println("trying to read from scanner after closing it");
            unchecked(15,3);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println("trying to open a directory instead of file");
            checked("Week 5/Answer 3/directory");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println("trying to read from and write to a read only file");
            checked(fileName);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Output

// trying to divide by zero
// java.lang.ArithmeticException: / by zero
// trying to read from scanner after closing it
// java.lang.IllegalStateException: Scanner closed
// trying to open a directory instead of file
// java.io.FileNotFoundException: Week 5\Answer 3\directory (Access is denied)
// trying to read from and write to a read only file
// Trying to read first character from file
// The int equivalent for 1st character read is: -1
// java.io.FileNotFoundException: Week 5\Answer 3\thisfileexists.txt (Access is denied)