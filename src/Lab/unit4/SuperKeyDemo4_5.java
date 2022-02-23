package Lab.unit4;

class Addition{
	int x,y;
	Addition(){
		x=0;
		y=0;
	}
	public Addition(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	void Display() {
		System.out.println("Sum of X and Y:"+(x+y));
	}
	
}

class Multiply extends Addition{
	int m;
	Multiply(){
		super();
		m=0;
	}
	public Multiply(int m,int x,int y) {
		super(x,y);
		this.m = m;
	}
	void Display() {
		super.Display();
		System.out.println("Multiply of three num(x*y*m):"+(x*y*m));
	}
	
	
}

public class SuperKeyDemo4_5 {

	public static void main(String[] args) {
		Multiply mobj=new Multiply(2,3,4);
		mobj.Display();
		
		Addition addobj=new Multiply(2,4,6);
		addobj.Display();
	}

}
