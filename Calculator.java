// Answer to Question 1

class Calculator {
	int add(int a, int b) {
		return a+b;
	}
	
	int subtract(int a, int b) {
		return a-b;
	}
	
	int multiply(int a, int b) {
		return a*b;
	}
	
	float divide(float a, int b) {
		return a/b;
	}

	int modulus(int a, int b) {
		return a%b;
	}

	boolean and(boolean a, boolean b) {
		return a && b;
	}

	boolean or(boolean a, boolean b) {
		return a || b;
	}

	boolean not(boolean a) {
		return !a;
	}
}

class Main {
	public static void main(String[] args) {
	Calculator obj = new Calculator();
	System.out.println("100 + 30 = " + obj.add(100,30));
	System.out.println("100 - 30 = " + obj.subtract(100,30));
	System.out.println("100 * 30 = " + obj.multiply(100,30));
	System.out.println("100 / 30 = " + obj.divide(100,30));
	System.out.println("100 % 30 = " + obj.modulus(100,30));
	System.out.println("true and false = " + obj.and(true,false));
	System.out.println("true or false = " + obj.or(true,false));
	System.out.println("not true = " + obj.not(true));
	}
}

// Output

// 100 + 30 = 130
// 100 - 30 = 70
// 100 * 30 = 3000
// 100 / 30 = 3.3333333
// 100 % 30 = 10
// true and false = false
// true or false = true
// not true = false
