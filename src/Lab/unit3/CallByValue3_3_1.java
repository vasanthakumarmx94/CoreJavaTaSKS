package Lab.unit3;

//Call by value
class ExampleTest{
	void Addition(int a,int b)
	{
		int c=a+b;
	}
}


public class CallByValue3_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExampleTest t=new ExampleTest();
		int a=10,b=20;
		System.out.println("Before Call: A="+a+", B="+b);
		t.Addition(a,b);
		System.out.println("After Call: A="+a+", B="+b);
		
	}

}
