package Session;

import java.util.Scanner;

public class StudentMainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of How many students you Add:");
		int numstd=sc.nextInt();
		Student std[];
		std=new Student[numstd];
		
		int stdid,stdmarks;
		String stdname,stdcource;
		//11 vasu BCA 70
		//12 kiran MCA 80
		//13 Ramu BCA 60
		//14 Harsha BCA 50
		//15 vamshi BSC 40
		int k=0;
		for(int i=0;i<numstd;i++) {
			System.out.println("Enter Student "+(++k)+" details:");
			System.out.println("stdid    stdname    stdcource   stdmarks ");
			stdid=sc.nextInt();
			stdname=sc.next();
			stdcource=sc.next();
			stdmarks=sc.nextInt();
			std[i]=new Student(stdid,stdname,stdcource,stdmarks);
		}
		System.out.println("students having more than 60 marks from BCA course:\n ");
		for(int i=0;i<numstd;i++) {
			if(std[i].marks>60 && std[i].course.equals("BCA")) {
				System.out.println("StdId:"+std[i].stid+" ,  StdName:"+std[i].name+", Stdcource:"+std[i].course+" , stdmarks:"+std[i].marks);
			}
		}
		sc.close();
	}

}
