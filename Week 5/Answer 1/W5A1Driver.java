import Vaccination.Citizen;
import Vaccination.*;

public class W5A1Driver {
    public static void main(String[] args) {
        Citizen adult = new Vaccine("John", "135792468", "1234567", 34);
        try {
            adult.verifyAge();
        } catch (Exception e) {
            System.out.println(e);
        }
        Citizen child = new Vaccine("Mary", "246813579", "4567890", 14);
        try {
            child.verifyAge();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Output

// John, 34, can be vaccinated
// java.lang.Exception: Mary, 14, is too young for vaccination