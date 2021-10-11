package Lab.unit2;

public class TrianglePattren2_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n*2;i=i+2) {
			for(int j=0;j<=i;j=j+1) {
				if(j==0 ||j==i)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
			
		}

	}

}
/*OUTPUT
 
    1
	101
	10001
	1000001
	100000001*/
