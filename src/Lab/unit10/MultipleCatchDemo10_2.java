package Lab.unit10;

public class MultipleCatchDemo10_2 {

	public static void main(String[] args) {
		//Multiple catch blocks
		 try{    
             int a[]=new int[5];  //array   
             a[8]=30/0;    //arrayOutOfBound exception,divideByzero
            }    
            catch(ArithmeticException e)  
               {  
                System.err.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.err.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
            catch(Exception e)  
               {  
                System.err.println("Parent Exception occurs");  
               }             
            System.out.println("Rest of the code............");    
	}

}
