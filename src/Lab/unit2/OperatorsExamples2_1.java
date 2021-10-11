package Lab.unit2;

public class OperatorsExamples2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Arithmetic operator Usage Example\n ");
		int x = 20, y = 10;

	    // addition operator
	    System.out.println("x + y = " + (x + y));

	    // subtraction operator
	    System.out.println("x - y = " + (x - y));

	    // multiplication operator
	    System.out.println("x * y = " + (x * y));

	    // division operator
	    System.out.println("x / y = " + (x / y));

	    // modulo operator
	    System.out.println("x % y = " + (x % y));
	    System.out.println("\n+=======================================================+ ");
		
		
		// bitwise and
		System.out.println("bitwise operator Usage Example\n ");
		int a = 5;
        int b = 7;
 
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));
 
        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));
 
        // bitwise xor
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));
 
        // bitwise not
        // ~0101=1010
        // will give 2's complement of 1010 = -6
        System.out.println("~a = " + ~a);
        // a=a&b
        a &= b;
        System.out.println("a= " + a);
        
        System.out.println("\n+============================================+ ");
        System.out.println("Relational operator Usage Example\n ");
        int m = 7, n = 11;

        // value of a and b
        System.out.println("a is " + m + " and b is " + n);

        // == operator
        System.out.println(m == n);  // false

        // != operator
        System.out.println(m != n);  // true

        // > operator
        System.out.println(m > n);  // false

        // < operator
        System.out.println(m < n);  // true

        // >= operator
        System.out.println(m >= n);  // false

        // <= operator
        System.out.println(m <= n);  // true
        
        System.out.println("\n+============================================+ ");
        System.out.println("Conditional operator Usage Example\n ");
     // && operator
        System.out.println("(5 > 3) && (8 > 5)="+((5 > 3) && (8 > 5)));  // true
        System.out.println("(5 > 3) && (8 < 5)="+((5 > 3) && (8 < 5)));  // false

        // || operator
        System.out.println("(5 < 3) || (8 > 5)="+((5 < 3) || (8 > 5)));  // true
        System.out.println("(5 > 3) || (8 < 5)="+((5 > 3) || (8 < 5)));  // true
        System.out.println("(5 < 3) || (8 < 5)="+((5 < 3) || (8 < 5)));  // false

        // ! operator
        System.out.println("!(5 == 3)="+!(5 == 3));  // true
        System.out.println("!(5 > 3)="+!(5 > 3));  // false

	}

}
