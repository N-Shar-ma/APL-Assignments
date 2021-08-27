public class ArrayDivide {
    int[] myArr;
    boolean error;

    ArrayDivide(int[] myArr) {
        this.myArr = new int[15];
        try {
            if(myArr.length!=15)
            throw new IllegalArgumentException("Array passed must have exactly 15 elements, but this has " + myArr.length + " elements.");
            this.myArr = myArr;
        } catch (Exception e) {
            error = true;
            System.out.println(e);
        }
    }

    void divide(int divisor) {
        try {
            for (int i = 0; i < 15; i++) {
                int current = myArr[i]/divisor;
                System.out.print(current + " ");
            }
            System.out.println();
        } catch(Exception e) {
            System.out.println(e);
            error = true;
        }
    }

    public static void main(String[] args) {
        int[] wrongSize = {2,4,6};
        int[] correctSize = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150};
        ArrayDivide shorter = new ArrayDivide(wrongSize);
        if(!shorter.error) {
            System.out.println("Attempting to divide by 2...");
            shorter.divide(2);
        }
        ArrayDivide right = new ArrayDivide(correctSize);
        if(!right.error) {
            System.out.println("Attempting to divide by 5...");
            right.divide(5);
            System.out.println("Attempting to divide by 0...");
            right.divide(0);
        }
    }
}

// Output

// java.lang.IllegalArgumentException: Array passed must have exactly 15 elements, but this has 
// 3 elements.
// Attempting to divide by 5...
// 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30
// Attempting to divide by 0...
// java.lang.ArithmeticException: / by zero