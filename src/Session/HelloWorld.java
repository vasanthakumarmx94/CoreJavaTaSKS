package Session;

public class HelloWorld {

	int x=100;//data member of this class
	static int y=200;
	public void show() {//instance method
		System.out.println("inside object:"+x);
	}
	
	
	public static void main(String[] args) {//class method
		// TODO Auto-generated method stub
		HelloWorld hello=new HelloWorld();//creating new instance
		//this instance have its own copy
		System.out.println("Hello world!!"+hello.x);
		//can access from instance
		
		System.out.println("Hello world!!"+y);
		hello.show();//can access from instance

	}

}
