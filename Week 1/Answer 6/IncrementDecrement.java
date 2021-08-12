// Answer to Question 6

public class IncrementDecrement {
    public static void main(String[] args) {
        int a, b, c, d, e, f, z=8;
        a = z++ + ++z;
        b = z-- + --z;
        c = z++;
        d = ++z;
        e = z--;
        f = --z;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}

// Output

// a = 18
// b = 18
// c = 8
// d = 10
// e = 10
// f = 8
