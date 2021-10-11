package Lab.unit5;

abstract class debuggable {
	abstract void dump();

}

class Demo1 extends debuggable {

	private int a, b, c;

	public Demo1(int a, int b, int c) {
		// super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	void dump() {
		System.out.println("a=" + a + " ,b=" + b + " , c=" + c);
	}
}

class Demo2 extends debuggable {

	private int x, y, z;

	public Demo2(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	void dump() {
		System.out.println("X=" + x + " ,Y=" + y + " , Z=" + z);
	}
}

class Demo3 extends debuggable{
	
	private int p,q,r;
	
	public Demo3(int p, int q, int r) {
		super();
		this.p = p;
		this.q = q;
		this.r = r;
	}

	@Override
	void dump() {
		System.out.println("P=" + p + " ,Q=" + q + " , R=" + r);
		
	}
	
}

public class AbstractDemo5_3 {

	public static void main(String[] args) {
		
		Demo1 d;
		Demo2 d1;
		Demo3 d2;
		
		d=new Demo1(3,7,8);
		d1=new Demo2(8,5,6);
		d2=new Demo3(6,1,1);
		d.dump();
		d1.dump();
		d2.dump();
		
		//Demo1 d1=new Demo1(2,3,4);
		
	}

}
