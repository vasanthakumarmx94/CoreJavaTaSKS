package Lab.Mypack;

public class Circle {
	double r;
	public Circle(double r) {
		super();
		this.r = r;
	}
	public void area() {
		System.out.println("Area of the circle = " + (3.14 * r * r));
	}
}
class Square {
	double s;

	public Square(double s) {
		super();
		this.s = s;
	}
	void area() {
		System.out.println("Area of the Square = " + (s * s));
	}
}
 class Rectangle1 {
	double l, b;
	public Rectangle1(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}

	void area() {
		System.out.println("Area of the circle = " + (l * b));
	}
}
