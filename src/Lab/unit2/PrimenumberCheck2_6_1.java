package Lab.unit2;

public class PrimenumberCheck2_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=17;
		int flag=0;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println(n+" not a prime number");
		else
			System.out.println(n+" is a prime number");

	}

}
