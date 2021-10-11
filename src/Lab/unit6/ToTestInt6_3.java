package Lab.unit6;

 interface Test 
{ 
 public void square(int a); 
 }

class Arithmetic implements Test{
	//int s=0;
	@Override
	public void square(int b) {
		System.out.println("Inside arithmetic-implemented squaremethod;");
		System.out.println("Square of "+b+"is "+b*b);
		//return (b*b);
	}
	
	void armeth() {
		System.out.println("inside arithmatic class");
	}
}

public class ToTestInt6_3 {

	public static void main(String[] args) {
		System.out.println("Callling from TotestInt class :");
		Test t=new Arithmetic();
		System.out.println();
		t.square(5);
		//t.armeth(); //this is not working bcz reference is created to interface this is  instace method

	}

}
