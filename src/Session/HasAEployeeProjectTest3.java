package Session;

import java.util.Scanner;

public class HasAEployeeProjectTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Employes you want Add:");
		int num = sc.nextInt();

		// project adding
		Project pro[];
		pro = new Project[num];
		int proid;
		String proname;
		String prolocation;
		for (int i = 0; i < num; i++) {
			System.out.println("Enter Project Datails:");
			System.out.println("pid      pname    plocation");
			proid = sc.nextInt();
			proname = sc.next();
			prolocation = sc.next();
			pro[i] = new Project(proid, proname, prolocation);
		}
		// 101 MobileAppforProjectManagement Mysore
		// 102 ECommerceWebApp Banglore
		// 103 MobileAppforProjectManagement Mumbai
		// 104 ECommerceWebApp Pune
		System.out.println("+--------------------------------------------------------+");
		Employee emp[];
		emp = new Employee[num];
		int empid;
		String empname;
		double empsal;
		// Crate two employees and assign them a Project as "Mobile App for Project
		// management"
		// create two more employees and assign them a Project as "E-Commerce Web App"
		for (int i = 0; i < num; i++) {
			System.out.println("Enter Employee Datails:");
			System.out.println("eid      ename    esal");
			empid = sc.nextInt();
			empname = sc.next();
			empsal = sc.nextDouble();
			emp[i] = new Employee(empid, empname, empsal,pro[i]);
		}
		// 11 vasu 10000
		// 12 kiran 16000
		// 13 Arun 26000
		// 14 Preetham 90000

		//
		// here the logic for
		// Out of these 4 display employees having salary > 25000 and working for Webapplication.
		//&& emp[j].project.pname=="ECommerceWebApp"
		System.out.println("Employee detail Are:");
		for (int j = 0; j < num; j++) {
			
			if(emp[j].esal>25000 && emp[j].project.pname.equalsIgnoreCase("ECommerceWebApp") ) {
				
				System.out.println("Empid:"+emp[j].eid+",  EmpName:"+emp[j].ename+", Salary:"+emp[j].esal +",  Projectname: "+emp[j].project.pname);
			}

		}

	}

}

class Employee {
	int eid;
	String ename;
	double esal;
	Project project;

	public Employee(int eid, String ename, double esal, Project project) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.project = project;
	}

}

//relation with Author and Publisher (Has-a)
class Project {
	int pid;
	String pname;
	String plocation;

	public Project(int pid, String pname, String plocation) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
	}

}
