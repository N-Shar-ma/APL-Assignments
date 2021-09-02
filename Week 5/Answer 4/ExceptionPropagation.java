public class ExceptionPropagation {

    void fourth() {
        throw new ArithmeticException("occurs in method fourth");
    }

    void third() {
        fourth();
    }

    void second() {
        third();
    }

    void first() {
        second();
    }
    public static void main(String[] args) {
        ExceptionPropagation obj = new ExceptionPropagation();
        try {
            obj.first();
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Exception handling done in main");
        }
    }
}

// Output

// java.lang.ArithmeticException: occurs in method fourth
// Exception handling done in main