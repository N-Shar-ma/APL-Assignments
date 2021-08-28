import java.util.Arrays;

class ArraySort {

    static void sort(int[] myArr) throws Exception {
        if(myArr.length!=10) 
        throw new IllegalArgumentException("Array passed must have exactly 10 elements, but this has " + myArr.length + " elements.");
        Arrays.sort(myArr);
        for (int i : myArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] tooShortArray = {5,4,3,2,1};
        int[] rightSizeArray = {10,9,8,7,6,5,4,3,2,1};
        int[] tooLongArray = {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        try {
            System.out.println("Trying to sort an array that's too short...");
            ArraySort.sort(tooShortArray);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println("Trying to sort an array that's the correct length...");
            ArraySort.sort(rightSizeArray);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println("Trying to sort an array that's too long...");
            ArraySort.sort(tooLongArray);            
        } catch (Exception e) {
            System.out.println(e);
        }
    } 
}

// Output

// Trying to sort an array that's too short...
// java.lang.IllegalArgumentException: Array passed must have exactly 10 elements, but this has 
// 5 elements.
// Trying to sort an array that's the correct length...
// 1 2 3 4 5 6 7 8 9 10
// Trying to sort an array that's too long...
// java.lang.IllegalArgumentException: Array passed must have exactly 10 elements, but this has 
// 15 elements.