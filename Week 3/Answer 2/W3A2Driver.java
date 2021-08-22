public class W3A2Driver {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 25, b = 5;
        System.out.println("25 + 5 = " + calc.add(a, b));
        System.out.println("25 - 5 = " + calc.subtract(a, b));
        System.out.println("25 * 5 = " + calc.multiply(a, b));
        System.out.println("25 / 5 = " + calc.divide(a, b));
    }
}

// Output

// 25 + 5 = 30
// 25 - 5 = 20
// 25 * 5 = 125
// 25 / 5 = 5