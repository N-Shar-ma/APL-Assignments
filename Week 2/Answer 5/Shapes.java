import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        String shape;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the shape you wish to calculate area of:");
        shape = sc.next().toLowerCase().trim();
        double area = 0;
        switch(shape) {
            case "square":
                double s;
                System.out.println("Enter length of side");
                s = sc.nextDouble();
                area = s*s;
                break;
            case "rectangle":
                double h,w;
                System.out.println("Enter height then width");
                h = sc.nextDouble();
                w = sc.nextDouble();
                area = h*w;
                break;
            case "triangle":
                double l,p;
                System.out.println("Enter length of a side then the perpendicular height from it");
                l = sc.nextDouble();
                p = sc.nextDouble();
                area = 0.5*l*p; 
                break;        
            case "circle":
                double r;
                System.out.println("Enter radius");
                r = sc.nextDouble();
                area = Math.PI*r*r;
                break;
            case "pentagon":
                double a;
                System.out.println("Enter length of side");
                a = sc.nextDouble();
                area = 1.72048*a*a;
        }
        System.out.println("The area of your " + shape + " is: " + area);
    }
}

// Output

// Enter the name of the shape you wish to calculate area of:
// Square
// Enter length of side
// 15
// The area of your square is: 225.0