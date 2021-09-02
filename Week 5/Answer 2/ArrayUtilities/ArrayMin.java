package ArrayUtilities;

public class ArrayMin {
    public static int min(int[] arr) throws Exception {
        if(arr.length==0) throw new Exception("No minimum in an empty array");
        int min = arr[0];
        for (int i : arr) {
            if(i<min) min = i;
        }
        return min;
    }
}
