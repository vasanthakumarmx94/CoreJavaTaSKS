package Lab.unit7;

public class Fibonacci7_3_2 {
	private static long fibonacci(int n) {
		if(n<=1)
			return 1;
		else
			return(fibonacci(n-1)+fibonacci(n-2));
	}
	public static void main(String[] args) {

		long l = fibonacci(5);
		System.out.println("Fibonacci series of 5 is:"+l);
		
	}
}
