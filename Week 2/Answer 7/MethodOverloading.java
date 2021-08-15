public class MethodOverloading {
    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println("1 + 2 = " + add(1,2));
        System.out.println("1 + 2 + 3 = " + add(1,2,3));
    }
}

// Output

// 1 + 2 = 3
// 1 + 2 + 3 = 6