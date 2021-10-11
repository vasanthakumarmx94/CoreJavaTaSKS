package Lab.unit4;
//inheritance example

class A{
	int a,b;
	void Display() {
		System.out.println("a="+a+", b="+b);
	}
	
}
class B extends A{
	int m;
	void Show() {
		System.out.println("M="+m);
	}
	void sum() {
		int result=a+b+m;
		System.out.println("Sum of a+b+m="+result);
	}
}



//main demo class from here
public class InheritanceDemo4_3 {

	public static void main(String[] args) {
		
		A supAobj=new A(); //object for super class A
		B subBobj=new B(); //object for subclass B
		
		supAobj.a=20;//set values to super class members
		supAobj.b=30;
		System.out.println("Super class A:content of a and b=>");
		supAobj.Display();
		System.out.println();
		
		subBobj.a=50;
		subBobj.b=50;
		subBobj.m=100;
		System.out.println("Sub class content a,b,m=>");
		subBobj.Display();
		subBobj.Show();
		System.out.println();
		
		System.out.println("Sum of a, b and m in subclass b=>");
		subBobj.sum();

	}

}
