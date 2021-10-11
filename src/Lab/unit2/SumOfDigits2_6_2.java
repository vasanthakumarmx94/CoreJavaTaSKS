package Lab.unit2;

public class SumOfDigits2_6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=423;
		int sum=0;
		int r;
		System.out.println("Given number:"+n);
		do {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		while(n>0);
		
		System.out.println("Sum of digits number:"+sum);

	}

}
