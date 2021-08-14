public class Fibonacci {
    public static void main(String arg[]) {
        int a = 0, b = 1, c;
        System.out.println(a);
        System.out.println(b);
        while(a+b<=100) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}

// Output

// 0
// 1 
// 1 
// 2 
// 3 
// 5 
// 8 
// 13
// 21
// 34
// 55
// 89