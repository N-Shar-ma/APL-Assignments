// Answer to Question 3 - Part 1 (using methods)

class Box{	
    int length, width, height;

    void setLength(int l){
		length = l;
	}

    void setWidth(int w) {
		width = w;
	}

    void setHeight(int h) {
		height = h;
	}

    int getVolume() {
		return length*width*height;
	}
}

class Rectangle{
    int length, breadth;

    void setLength(int l) {
		length = l;
	}

    void setBreadth(int b) {
		breadth = b;
	}
    
	int getArea() {
		return length*breadth;
	}
}

class Circle{
    int radius;

    void setRadius(int r) {
		radius = r;
	}
    
	double getArea() {
		return Math.PI*radius*radius;
	}
}


class Main {
	public static void main(String args[]) {
		Box b = new Box();
		b.setLength(5);
		b.setWidth(2);
		b.setHeight(3);
		System.out.println("The volume of a box with length 5, width 2 and height 3 is "+ b.getVolume() + " units.");

		Rectangle r = new Rectangle();
		r.setLength(10);
		r.setBreadth(4);
		System.out.println("The area of a rectangle with length 10 and breadth 4 is "+ r.getArea() + " units.");

		Circle c = new Circle();
		c.setRadius(7);
		System.out.println("The area of a circle with radius 7 is "+ c.getArea() + " units.");
	}
}

// Output

// The volume of a box with length 5, width 2 and height 3 is 30 units.
// The area of a rectangle with length 10 and breadth 4 is 40 units.
// The area of a circle with radius 7 is 153.93804002589985 units.
