package Lab.unit10;



//user defined exception
class MyException extends Exception {

	String msg;

	public MyException(String msg) {
		super(msg);
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "MY Exception:" + msg;
	}

}

public class UserDefinedException10_6 {

	public static void main(String[] args) {

		try {
			int a = 10, b = 5;
			if (b == 5) {
				throw new MyException("b should not be 5");
			}

		} catch (MyException m) {
			System.out.println(m);
			//System.out.println(m.getMessage());
		}

	}
}
