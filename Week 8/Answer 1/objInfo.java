import java.util.*;

public class objInfo<T extends Collection<?>> {
    T collection;
    public objInfo(T collection) {
        this.collection = collection;
    }
    
    private void printInfo() {
        System.out.println("The type of this collection is: " + collection.getClass().getSimpleName() + "\nand it's length is: " + collection.size() + ".\nIt's elements are:");
        collection.forEach(e -> {
            System.out.println(e);
        });
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3));
        objInfo<ArrayList<Integer>> o1 = new objInfo<>(arrayList);
        o1.printInfo();
        List<String> list= Arrays.asList("one", "two", "three");
        objInfo<List<String>> o2 = new objInfo<>(list);
        o2.printInfo();
        Set<Character> set = new HashSet<>(Arrays.asList('1', '2', '3'));
        objInfo<Set<Character>> o3 = new objInfo<>(set);
        o3.printInfo();
    }
}

// Output

// The type of this collection is: ArrayList
// and it's length is: 3.
// It's elements are:
// 1
// 2
// 3

// The type of this collection is: ArrayList
// and it's length is: 3.
// It's elements are:
// one
// two
// three

// The type of this collection is: HashSet
// and it's length is: 3.
// It's elements are:
// 1
// 2
// 3
