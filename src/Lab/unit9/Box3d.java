package Lab.unit9;

class Box {
	private int length;
	private int breadth;

	public Box() {
		length = 0;
		breadth = 0;
	}

	public Box(int x, int y) {
		length = x;
		breadth = y;

	}

	public void setValue(int x, int y) {
		length = x;
		breadth = y;
	}

	public int area(int length,int breadth) {
		return (length * breadth);
	}
}

class Box3d extends Box {
	private int height;
	int ar;
	public Box3d() {
		super();
		height = 0;
	}

	public Box3d(int x, int y) {
		super(x, y);
		height = 0;
	}

	public void setValue(int x, int y, int z) {
		ar=super.area( x,y);
		System.out.println("The are is:"+ar);
		height = z;
	}

	public int volume() {
		return (ar* height);
	}

	public static void main(String[] args) {

		Box b = new Box();
		Box3d b2 = new Box3d();
		b2.setValue(25,30,2);
		System.out.println("The area is:"+b2.area(2, 6) );
		System.out.println("The volume is:" + b2.volume());

	}

}
