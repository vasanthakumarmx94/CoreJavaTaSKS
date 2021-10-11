package Lab.unit6;

interface Addition{
	int add(int x, int y);
	
}
interface Subtraction{
	int sub(int x,int y);
}
class UseInterface implements Addition,Subtraction{

	@Override
	public int add(int a,int b) {
		return(a+b);
		
	}
	@Override
	public int sub(int a,int b) {
		return (a-b);
		
	}
	
}

public class MultipleInheritance6_2 {

	public static void main(String[] args) {
		UseInterface iob=new UseInterface();
		
		System.out.println("Addition-->"+iob.add(10,20));
		System.out.println("Subtract-->"+iob.sub(10,20));

	}

}
