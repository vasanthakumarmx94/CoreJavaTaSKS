package Session;

class Shape{
	void area() {
		System.out.println("here you find area of various shapes");
	}
	void draw() {
		System.out.println("Here yoy draw the shapes cordinates");
	}
}
class Circle extends Shape{
	int r;
	void area(int r) {
		System.out.println("circle Area:"+3.14*r*r);
	}
	void draw() {
		//(x – h)2+ (y – k)2 = r2,
		System.out.println("Drawing shape Circle with cordinates:");
	}
}
class Triangle extends Shape{
	double b,h;
	public Triangle(double b, double h) {
		super();
		this.b = b;
		this.h = h;
	}
	void area() {
		System.out.println("Triangle Area:"+0.5*b*h);
	}
	void draw() {
		System.out.println("Drawing shape Triangle with cordinates:");
	}
}
class Square extends Shape{
	int a;
	public Square(int a) {
		super();
		this.a = a;
	}
	void area() {
		System.out.println("Square Area:"+a*a);
	}
	void draw() {
		//perimeter=4*a
		System.out.println("Drawing shape Square with cordinates:"+4*a);
	}
}




public class InheritancePolymorphismDemo4 {

	public static void main(String[] args) {
		//base class methods
		Shape s=new Shape();
		s.area();
		s.draw();
		//
		Circle c=new Circle();
		c.area(5);
		c.draw();
		System.out.println();
		Triangle t=new Triangle(5,5);
		t.area();
		t.draw();
		System.out.println();
		Square sq=new  Square(10);
		sq.area();
		sq.draw();
		
	}

}
