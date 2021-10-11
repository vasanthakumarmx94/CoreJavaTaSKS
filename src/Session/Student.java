package Session;

public class Student {
	int stid;
	String name;
	String course;
	int marks;
	public Student(int stid, String name, String course, int marks) {
		
		this.stid = stid;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}
	public void show() {
		System.out.println( "Stid:"+stid+", name:"+name+",course:"+course
				+",marks:"+marks);
	}


}
