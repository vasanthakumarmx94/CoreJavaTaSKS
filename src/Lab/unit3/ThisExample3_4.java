package Lab.unit3;

	public class ThisExample3_4 { 
		 int x; 
		 int y; 
		 ThisExample3_4( int x, int y) 
		{ 
		this.x = x; 
		this.y = y; 
		} 
		void displayPoint ( ) { 
		 System.out.println("The x Valueis:"+x);
		 System.out.println("The y Valueis:"+y);
		 
		 } 
	}
	class ThisReturn{
		
		 int sum=10;
		 int i=30;
		 ThisReturn Add() 
		  { 
			 i++;
			 sum=sum+10;
		  
		  return this ; 
		  } 
		 void print() {
			 System.out.println("The i value is:"+i);
			 System.out.println("The SUM value is:"+sum);
	
		 }
				
		public static void main ( String arg [ ] ) { 
			
			ThisExample3_4 ts = new ThisExample3_4(10,20); 
			ts. displayPoint ( ); 
			
			ThisReturn tr=new ThisReturn();
			tr.Add().Add().Add().print();
			
		 } 
		}
	

