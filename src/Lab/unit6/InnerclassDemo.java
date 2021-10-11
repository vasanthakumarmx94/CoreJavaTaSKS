package Lab.unit6;

class Outer {
	
	void display() {
		System.out.println("This is Outer Class");
	}

	void test() {
		Inner inner = new Inner();
		inner.display();
	}

//this is an inner class 
	class Inner {
		
		void display() {
			System.out.println("This is inner Class");
		}
	}
}

public class InnerclassDemo {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.display();
		outer.test();
	}

}
