// Answer to Question 3 - Part 2 (using parameterized constructors)

class Box{	
    int length, width, height;

	Box(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}

    int getVolume() {
		return length*width*height;
	}
}

class Rectangle{
    int length, breadth;

	Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}

	int getArea() {
		return length*breadth;
	}
}

class Circle{
    int radius;

    Circle(int r) {
		radius = r;
	}
    
	double getArea() {
		return Math.PI*radius*radius;
	}
}

class Main {
	public static void main(String args[]) {
		Box b = new Box(5, 2, 3);
		System.out.println("The volume of a box with length 5, width 2 and height 3 is "+ b.getVolume() + " units.");

		Rectangle r = new Rectangle(10, 4);
		System.out.println("The area of a rectangle with length 10 and breadth 4 is "+ r.getArea() + " units.");

		Circle c = new Circle(7);
		System.out.println("The area of a circle with radius 7 is "+ c.getArea() + " units.");
	}
}

// Output

// The volume of a box with length 5, width 2 and height 3 is 30 units.
// The area of a rectangle with length 10 and breadth 4 is 40 units.
// The area of a circle with radius 7 is 153.93804002589985 units.
