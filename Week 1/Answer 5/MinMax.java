// Answer to Question 5

class Ternary {
	int a, b, c, d;

	Ternary(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	int max() {
		int m = a;
		m = b > m ? b : m;
		m = c > m ? c : m;
		m = d > m ? d : m;
		return m;
	}

	int min() {
		int m = a;
		m = b < m ? b : m;
		m = c < m ? c : m;
		m = d < m ? d : m;
		return m;
	}
}

class IfElse {
	int a, b, c, d;

	IfElse(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	int max() {
		if(a>b && a>c && a>d) {
			return a;
		} else if(b>a && b>c && b>d) {
			return b;
		} else if(c>a && c>b && c>d) {
			return c;
		} else {
			return d;
		}
	}

	int min() {
		if(a<b && a<c && a<d) {
			return a;
		} else if(b<a && b<c && b<d) {
			return b;
		} else if(c<a && c<b && c<d) {
			return c;
		} else {
			return d;
		}
	}
}

public class Main {
    public static void main(String[] args) {
        Ternary obj1 = new Ternary(3, 7, 4, 9);
        IfElse obj2 = new IfElse(3, 7, 4, 9);
		System.out.println("Among 3, 7, 4 and 9");
		System.out.println("Max using ternary operator is " + obj1.max());
		System.out.println("Min using ternary operator is " + obj1.min());
		System.out.println("Max using if else statement is " + obj2.max());
		System.out.println("Min using if else statement is " + obj2.min());
    }
}

// Output

// Among 3, 7, 4 and 9
// Max using ternary operator is 9
// Min using ternary operator is 3
// Max using if else statement is 9
// Min using if else statement is 3
