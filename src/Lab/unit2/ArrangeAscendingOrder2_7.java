package Lab.unit2;

import java.util.Scanner;

public class ArrangeAscendingOrder2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter size of array:");  
	    int n=sc.nextInt();
	    int[] a = new int[10];  
	    System.out.println("Enter the elements of the array: \n");  
	    for(int i=0; i<n; i++)  
	    {  
	    a[i]=sc.nextInt();  
	    }  
	    int temp;
	    for(int i=0;i<n;i++) {
	    	for(int j=0;j<n-1;j++) {
	    		if(a[j]>a[j+1]) {
	    			temp=a[j];
	    			a[j]=a[j+1];
	    			a[j+1]=temp;
	    		}
	    	}
	    	
	    }
	    for(int i=0; i<n; i++)  
	    {  
	    System.out.print(a[i]+" "); 
	    }  
	    
	}

}
/*OUTPUT
 Enter size of array:
5
Enter the elements of the array: 
20 10 40 30 60
10 
20 
30 
40 
60 

 */
