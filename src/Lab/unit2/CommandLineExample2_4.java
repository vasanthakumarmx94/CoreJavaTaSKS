package Lab.unit2;

public class CommandLineExample2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int sum=0;
		for(int i=0;i<args.length;i++) {
		
				 try 
				 { 
				 sum += Integer.parseInt(args[i]); 
				 } 
				 catch(NumberFormatException e) 
				 { 
				 count++;
				
				 } 
				 }
		System.out.println("Sum og integers:"+sum);
		System.out.println("Number of Non integers are:"+count);
		}
	
		
		//get the name using command line arguments
		//String name=args[0];
		

	}


