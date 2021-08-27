import java.util.Arrays;

class ArraySort {
    int[] myArr;
    boolean error;

    ArraySort(int[] myArr) {
        this.myArr = new int[10];
        error = false;
        try {
            if(myArr.length!=10) 
            throw new IllegalArgumentException("Array passed must have exactly 10 elements, but this has " + myArr.length + " elements.");
            this.myArr = myArr;
        } catch (Exception e) {
            System.out.println(e);
            error = true;
        }
    }

    void sort() {
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
        System.out.println("Trying to sort an array that's too short...");
        ArraySort shorter = new ArraySort(tooShortArray);
        if(!shorter.error) shorter.sort();
        System.out.println("Trying to sort an array that's the correct length...");
        ArraySort right = new ArraySort(rightSizeArray);
        if(!right.error) right.sort();
        System.out.println("Trying to sort an array that's too long...");
        ArraySort longer = new ArraySort(tooLongArray);
        if(!longer.error) longer.sort();
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