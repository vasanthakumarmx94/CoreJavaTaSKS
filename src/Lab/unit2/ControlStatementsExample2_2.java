package Lab.unit2;

public class ControlStatementsExample2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if controle satement example
		int age=17;
		if(age>18)
			System.out.println("You are Eligible to vote");
		else 
			System.out.println("SORRY! your not Eligible");
		
		
		System.out.println("\n+================================+\n");
		System.out.println("Switch statement Example");
		
		//Switch satement example
		int month=7;    
	    String monthstr="";  
	    switch(month){    
	    //case statements within the switch block  
	    case 1: monthstr="1 - January";  
	    break;    
	    case 2: monthstr="2 - February";  
	    break;    
	    case 3: monthstr="3 - March";  
	    break;    
	    case 4: monthstr="4 - April";  
	    break;    
	    case 5: monthstr="5 - May";  
	    break;    
	    case 6: monthstr="6 - June";  
	    break;    
	    case 7: monthstr="7 - July";  
	    break;    
	    case 8: monthstr="8 - August";  
	    break;    
	    case 9: monthstr="9 - September";  
	    break;    
	    case 10: monthstr="10 - October";  
	    break;    
	    case 11: monthstr="11 - November";  
	    break;    
	    case 12: monthstr="12 - December";  
	    break;    
	    default:System.out.println("Invalid Month!");    
	    }    
	    //Printing month of the given number  
	    System.out.println(monthstr);  
	    
	    
	    System.out.println("\n+================================+\n");
		System.out.println("forloop statement Example");
		System.out.println("print even numbers between 1to20 using for loop:");
		for(int i=1;i<=20;i++) {
			if(i%2==0)
				System.out.print(i+"  ");
		}
		
		System.out.println("\n+================================+\n");
		System.out.println("while statement Example");
		System.out.println("print odd numbers between 1to20 using whileloop:");
		int i=1;
		while(i<=20) {
			if(i%2!=0)
				System.out.print(i+" ");
			i=i+1;
		}
		
		System.out.println("\n+================================+\n ");
		System.out.println("Do while statement Example");
		System.out.println("Reverse a number using do while loop;");
		int n=123;
		int rev=0;
		int r;
		System.out.println("Given number to Reverse"+n);
		do {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		while(n>0);
		
		System.out.println("Reversed number:"+rev);
		

		
	}

}
