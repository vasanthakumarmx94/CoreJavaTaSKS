package Lab.unit6;

interface A
{
	
	int Add(int x);//only declaration can done in interface
	void display(int x);
	
}
//interface B extends interface A: it includes Sub(),Display(),--it add Sub()
interface B extends A{
	int Sub(int x);
	
}

class Myclass implements B{

	@Override
	public int Add(int x) {
		System.out.println("implentation Add():"+x+"+100");
		return (x+100);
	}

	@Override
	public int Sub(int x) {
		System.out.println("implentation Add():"+x+"-100");
		return x-100;
	}
	@Override
	public void display(int x) {
		System.out.println("Result:"+x);
		
	}
}
public class InterfaceDemo6_1 {

	public static void main(String[] args) {
		Myclass mobj=new Myclass();
		int x=mobj.Add(20);
		mobj.display(x);
		int y=mobj.Sub(50);
		mobj.display(y);
		
	}

}
