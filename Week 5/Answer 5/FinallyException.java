public class FinallyException {
    void handlesAndThrowsException(boolean throwInTry) throws Exception {
        try {
            if(throwInTry) throw new Exception("thrown in try block");
            return;
        } catch(Exception e) {
            System.out.println(e);
            System.out.println("The above was handled in catch in same method");
        } finally {
            if(true) throw new Exception("thrown in finally block");
        }
    }

    public static void main(String[] args) {
        FinallyException obj = new FinallyException();
        try {
            System.out.println("When exception is handled before finally:");
            obj.handlesAndThrowsException(true);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The above was handled in catch in main method");
        }
        System.out.println();
        try {
            System.out.println("When exception is not handled before finally:");
            obj.handlesAndThrowsException(false);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("The above was handled in catch in main method");
        }
    }
}

// Output

// When exception is handled before finally:
// java.lang.Exception: thrown in try block
// The above was handled in catch in same method
// java.lang.Exception: thrown in finally block
// The above was handled in catch in main method
// 
// When exception is not handled before finally:
// java.lang.Exception: thrown in finally block
// The above was handled in catch in main method