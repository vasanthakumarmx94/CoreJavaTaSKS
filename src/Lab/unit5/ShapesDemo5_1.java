package Lab.unit5;

class Shape{
	void draw() {
		System.out.println("Shape draw() method");
	}
	void erase() {
		System.out.println("shape erase() method\n");
		
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Circle draw() method");
	}
	void erase() {
		System.out.println("Circle erase() method\n");
		
	}
	
}
class Triangle extends Shape{
	void draw() {
		System.out.println("Triangle draw() method");
	}
	void erase() {
		System.out.println("Triangle erase() method\n");
		
	}
	
}
class Square extends Shape{
	void draw() {
		System.out.println("square draw() method");
	}
	void erase() {
		System.out.println("Square erase() method\n");
		
	}
}

public class ShapesDemo5_1 {

	public static Shape randomshape() {
		int n=(int)(Math.random()*3);
		switch(n) {
		case 0: return new Circle();
		case 1:	return new Square();
		case 2: return new Triangle();
		default: System.out.println("default :");	
					return new Shape();
		}
	}
	public static void main(String[] args) {
		Shape s[]=new Shape[9];
		for(int i=0;i<s.length;i++) {
			s[i]=randomshape();
		}
		
		for(int i=0;i<s.length;i++) {
			s[i].draw();
			s[i].erase();
		}
	}

}
