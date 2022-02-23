package Lab.p1;

import java.util.*;

class Shape{
	int breadth;
	int height;
	public Shape(int breadth, int height) {
		
		this.breadth = breadth;
		this.height = height;
	}
	 void area() {
		System.out.println(this.breadth+" and "+this.height);	
	}	
}
class Rectangle extends Shape{

	public Rectangle(int breadth, int height) {
		super(breadth, height);
		
	}
	 void area() {
		 System.out.println("Area="+(breadth*height));		
	}
}

public class ShapeDemo {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers:");
		int l=sc.nextInt();
		int b=sc.nextInt(); 
		Shape shape=new Shape(l,b);
		shape.area();
		Shape rectangle=new Rectangle(10,20);
		rectangle.area();
	}

}
