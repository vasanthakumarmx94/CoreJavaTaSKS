package Lab.unit2;

import java.util.Scanner;

public class MatrixMultiplication2_9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter number of rowsOf Matrix A:");  
	    int r1=sc.nextInt();
	    System.out.println("Enter number of Cols of Matrix A:");  
	    int c1=sc.nextInt();
	    System.out.println("Enter number of rowsOf Matrix B:");  
	    int r2=sc.nextInt();
	    System.out.println("Enter number of Cols of Matrix B:");  
	    int c2=sc.nextInt();
	    
	    if(c1==r2) {
	    	int a[][]=new int[r1][c1];
	    	int b[][]=new int[r2][c2];
	    	int d[][]=new int[r1][c2];
	    	System.out.println("Enter element Matrix A:Rows-"+r1+" ,  Cols-"+c1+"\n"); 
	    	for(int i=0;i<r1;i++) {
	    		for(int j=0;j<c1;j++) {
	    			a[i][j]=sc.nextInt();
	    		}
	    	}
	    	System.out.println("Enter element Matrix B:Rows-"+r2+" ,Cols- "+c2+" \n"); 
	    	for(int i=0;i<r2;i++) {
	    		for(int j=0;j<c2;j++) {
	    			b[i][j]=sc.nextInt();
	    		}
	    	}
	    	System.out.println("Multiplication A*B:\n"); 
	    	for(int i=0;i<r1;i++) {
	    		for(int j=0;j<c2;j++) {
	    			for(int k=0;k<r2;k++) {
	    				d[i][j]=d[i][j]+a[i][k]*b[k][j];
	    			}
	    			
	    		}
	    	}
	    	for(int i=0;i<r1;i++) {
	    		for(int j=0;j<c2;j++) {
	    			System.out.print(d[i][j]+" ");
	    		}
	    		System.out.println();
	    	}
	    	
	    	

	    }

	}
}
