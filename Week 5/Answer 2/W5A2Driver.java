import ArrayUtilities.*;

public class W5A2Driver {
    static int sumByMin(int[] arr) throws Exception {
        return ArraySum.sum(arr)/ArrayMin.min(arr);
    }
    public static void main(String[] args) {
        int[] correct = {8,2,4,7,9,13,76};
        try {
            System.out.println(sumByMin(correct));
        } catch (Exception e) {
            System.out.println(e);
        }        
        int[] empty = {};
        try {
            System.out.println(sumByMin(empty));
        } catch (Exception e) {
            System.out.println(e);
        }        
        int[] hasZero = {0,2,4,7,9,13,76};
        try {
            System.out.println(sumByMin(hasZero));
        } catch (Exception e) {
            System.out.println(e);
        }        
    }
}

// Output

// 59
// java.lang.Exception: No minimum in an empty array
// java.lang.ArithmeticException: / by zero