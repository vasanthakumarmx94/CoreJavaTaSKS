package Lab.unit5;

abstract class Collage{
	int sid;
	String name;
	int marks;
	public Collage(int sid, String name,int marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks=marks;
	}
	void aggregade() {
		System.out.println("This is nonabstract method implementation in abstract class ");
	}
	abstract void displayStudent();
	
}
class Student extends Collage{

	public Student(int sid, String name,int marks) {
		super(sid, name,marks);
		
	}
	
	//unimplemented abstract method implemented in dertived class

	@Override
	void displayStudent() {
		System.out.println("sid:"+sid+", Name:"+name+", marks:"+marks);
		
	}
}

public class AbstractDemo5_2 {

	public static void main(String[] args) {
		Student s=new Student(11,"vasu",200);
		s.aggregade();//this super class method
		s.displayStudent();// this is declared in super class, implemented in subclass 
		

	}

}
