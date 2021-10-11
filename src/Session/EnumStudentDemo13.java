package Session;

import java.util.Scanner;

class Studentm {
	int stid;
	String stname;
	Subject s;
	int marks;

	public Studentm(int stid, String stname, Subject s, int marks) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.s = s;
		this.marks = marks;
	}
}

public class EnumStudentDemo13 {

	public static void main(String[] args) {
		Studentm s1 = new Studentm(11, "vasu", Subject.JAVA, 600);
		Studentm s2 = new Studentm(12, "praveen", Subject.CPP, 500);
		Studentm s3 = new Studentm(13, "Karan", Subject.C, 400);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter subject to disply student:");
		Studentm sm[] = { s1, s2, s3 };
		String sub = sc.next().toUpperCase();
		//Subject s;
		System.out.println("Details students:");
		for (Studentm std : sm) {
			//System.out.println(std.valueOf(sub).toString().equals(sub));
			//System.out.println(Subject.valueOf(sub).toString()+","+std.s);
			//System.out.println(Subject.valueOf(sub)==(std.s));
			if (Subject.valueOf(sub)==(std.s)) {
				System.out.println("sid:"+std.stid+", sname:" + std.stname + ", subject :" + std.s+", Marks:"+std.marks );
			}
		}

	}

}
