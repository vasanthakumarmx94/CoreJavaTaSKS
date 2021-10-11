package Lab.unit7;

public class Factorial7_3_1 {

	static int findfact(int n) {
		if(n<=1)
			return 1;
		else
			return (n*findfact(n-1));
		
	}
	public static void main(String[] args) {
		
		int a=5,b=10,c=15;
		int fa=findfact(a);
		int fb=findfact(b);
		int fc=findfact(c);
		System.out.println("Fact");
		
		
	}

}
