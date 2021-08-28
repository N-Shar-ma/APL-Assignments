public class ArrayDivide {

    static void divide(int[] myArr, int divisor) throws Exception {
        if(myArr.length!=15)
            throw new IllegalArgumentException("Array passed must have exactly 15 elements, but this has " + myArr.length + " elements.");
        for (int i = 0; i < 15; i++) {
            int current = myArr[i]/divisor;
            System.out.print(current + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] wrongSize = {2,4,6};
        int[] correctSize = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150};
        try {
            System.out.println("Trying to divide wrong sized array");
            ArrayDivide.divide(wrongSize, 2);
        } catch (Exception e) {
            System.out.println(e);
        }
        try{
            System.out.println("Trying to divide correct sized array by 5");
            ArrayDivide.divide(correctSize, 5);
        } catch (Exception e) {
            System.out.println(e);
        }
        try{
            System.out.println("Trying to divide correct sized array by 0");
            ArrayDivide.divide(correctSize, 0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Output

// Trying to divide wrong sized array
// java.lang.IllegalArgumentException: Array passed must have exactly 15 elements, but this has 
// 3 elements.
// Trying to divide correct sized array by 5
// 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 
// Trying to divide correct sized array by 0
// java.lang.ArithmeticException: / by zero