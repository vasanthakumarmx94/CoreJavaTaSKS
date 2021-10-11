package Session;


import java.util.Scanner; 

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findingEX_1 pol=new findingEX_1();
		Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter number to check polindrom:");  
	    int num= sc.nextInt();   
		pol.polindrom(num);
		System.out.println("The pattern is:");
		pol.pattern(4);
		//int a[]= {20,10,50,30,40};
		//int n=a.length;
		//pol.swapmax(a,n)

	}

}
