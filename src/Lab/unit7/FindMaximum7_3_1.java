package Lab.unit7;

public class FindMaximum7_3_1 {

	public static void main(String[] args) {

		int a[]={7,4,9,5,2};
		int mx=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>mx) {
				mx=a[i];
			}
		}
		System.out.println("Maximum value is:"+mx);

	}

}
