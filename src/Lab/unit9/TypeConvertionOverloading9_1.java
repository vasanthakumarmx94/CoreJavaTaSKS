package Lab.unit9;

class OverloadDemo
{
	void test() {
		System.out.println("no parameters");
	}
	void test(int a,int b) {
		System.out.println("a="+a+", b="+b);
	}
	void test(double a) {
		System.out.println("Type convert to (Double):"+a);//automatic type convertion done fro lower type to upper type
		
	}
}

public class TypeConvertionOverloading9_1 {

	public static void main(String[] args) {
		OverloadDemo obj=new OverloadDemo();
		obj.test();
		obj.test(10, 20);
		obj.test(26);
	}
}
