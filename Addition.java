// Answer to Question 2

class Addition {
	private int a;
	private int b;
	private int c;
	private int d;
	
	Addition(int a, int b) {
		this.a = a;
		this.b = b;
		c = 0;
		d = 0;
	}
	
	Addition(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		d = 0;
	}
	
	Addition(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	int add() {
		return a+b+c+d;
	}
}

class Main {
	public static void main(String args[]) {
		Addition twoAdder = new Addition(4,5);
		Addition threeAdder = new Addition(4,5,7);
		Addition fourAdder = new Addition(4,5,7,2);
		System.out.println("4 + 5 = " + twoAdder.add());
		System.out.println("4 + 5 + 7 = " + threeAdder.add());
		System.out.println("4 + 5 + 7 + 2 = " + fourAdder.add());
	}
}

// Output

// 4 + 5 = 9
// 4 + 5 + 7 = 16
// 4 + 5 + 7 + 2 = 18
