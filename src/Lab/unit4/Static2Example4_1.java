package Lab.unit4;
class StaticDemo{
	static int m=10;
	static int n=20;
	static void show() {
		System.out.println("M"+m);
	}
}
public class Static2Example4_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo.show(); ///using class name we can acess static metod,
							//it also access without creating objects
		System.out.println("N="+StaticDemo.n);//static member of class StaticDemo
		

	}

}
