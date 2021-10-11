package Lab.unit10;

public class ThrowsException10_5 {
	// by using throws Exception we can handle exceptions
	public static void main(String[] args) throws Exception {

		System.out.println("Inside main");
		int i = 0;
		int j = 40 / i;
		System.out.println("this statement is not printed");
	}

}
