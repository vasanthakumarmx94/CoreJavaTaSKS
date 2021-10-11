package Lab.unit3;

class ExampleRef{
	int m,n,sum;
	ExampleRef(int a,int b)
	{
		m=a;
		n=b;
		
	}
	void Addition(ExampleRef e) {
		sum=e.m+e.n;
		e.m=30;
		e.n=60;
	}
}

public class CallByReference3_3_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExampleRef t2=new ExampleRef(10,20);
		System.out.println("Before Call: A="+t2.m+", B="+t2.n);
		t2.Addition(t2);
		System.out.println("After Call: A="+t2.m+", B="+t2.n);
		
	}
}
