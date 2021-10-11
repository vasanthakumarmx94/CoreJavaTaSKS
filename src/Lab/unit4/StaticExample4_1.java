package Lab.unit4;

public class StaticExample4_1 {
	static int a=10;
	static int n;
	static void display(int x) {
		System.out.println("x="+x);
		System.out.println("a="+a);
		System.out.println("b="+n);
	}
	static {
		System.out.println("This is static method");
		n=a*5;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(42);

	}

}
