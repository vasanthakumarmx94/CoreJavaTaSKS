package Lab.unit2;

import java.util.Scanner;

public class MatrixAddition2_9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter number of rows");  
	    int r=sc.nextInt();
	    System.out.println("Enter number of rows");  
	    int c=sc.nextInt();
	    if(r==c) {
	    	int a[][]=new int[r][c];
	    	int b[][]=new int[r][c];
	    	int d[][]=new int[r][c];
	    	System.out.println("Enter First matrix element "+r+" Rows, "+c+" Cols\n"); 
	    	for(int i=0;i<r;i++) {
	    		for(int j=0;j<c;j++) {
	    			a[i][j]=sc.nextInt();
	    		}
	    	}
	    	System.out.println("Enter Second matrix element"+r+" Rows,  "+c+" Cols\n"); 
	    	for(int i=0;i<r;i++) {
	    		for(int j=0;j<c;j++) {
	    			b[i][j]=sc.nextInt();
	    		}
	    	}
	    	
	    	System.out.println("Matrix Addition Given");
	    	for(int i=0;i<r;i++) {
	    		for(int j=0;j<c;j++) {
	    			d[i][j]=a[i][j]+b[i][j];
	    		}
	    	}
	    	System.out.println("OUTPUT:\n");
	    	for(int i=0;i<r;i++) {
	    		for(int j=0;j<c;j++) {
	    			System.out.print(d[i][j]+" ");
	    		}
	    		System.out.println();
	    	}
	    	
	    }
	    else {
	    	System.out.println("Matrix addition not possible");
	    }
	}

}
