package Lab.unit2;

public class ArrayExample2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];  
		a[0]=10; 
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
		System.out.println("Legth of array:"+ a.length);
		System.out.println("Array elements are:");
		for(int i=0;i<a.length;i++)//length of array  
		System.out.println(a[i]);  
		System.out.println("\n+=========================================+");
		System.out.println("Two Dimention Array :");
		int rows, columns;
		int[][] b = new int[100][50];

		for (rows = 0; rows <5 ; rows++) {
			for (columns = 0; columns < 5; columns++) {
				b[rows][columns] = rows + columns;
				System.out.print(b[rows][columns]+" ");
			}
			System.out.println();
		}
//		System.out.println("\n+=========================================+");
//		System.out.println("MultiDimention Array :");
//		int[][] c= { {1, -2, 3}, {-4, -5, 6, 9}, {7}, };
//	      
//	        for (int i = 0; i < a.length; ++i) {
//	            for(int j = 0; j < a[i].length; ++j) {
//	                System.out.print(c[i][j]+" ");
//	            }
//	        }
		
	
	}

}
