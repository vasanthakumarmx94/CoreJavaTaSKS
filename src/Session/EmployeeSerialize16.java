package Session;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSerialize16 {

	public static void main(String[] args) {
		List<Employee1> emp = new ArrayList<Employee1>();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		String outputFile = "Resource/emp.db";

		try {
			oos = new ObjectOutputStream(new FileOutputStream(outputFile));
			emp.add(new Employee1(101, "Abitha", 56000.5, 10));
			emp.add(new Employee1(102, "Arun", 78000.5, 10));
			emp.add(new Employee1(103, "Saritha", 34000.0, 13));
			emp.add(new Employee1(104, "Kiran", 29000.7, 14));
			emp.add(new Employee1(105, "Sonu", 66000.5, 15));

			for (Employee1 e : emp)
				oos.writeObject(e);

			// System.out.println("Serialization Done!!!!");

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			ois = new ObjectInputStream(new FileInputStream(outputFile));
			// System.out.println();
			System.out.println("Employee Details whose dno is 10");
			for (Employee1 e : emp) {
				if (e.getDno() == 10)
					System.out.println("   Emp ID : " + e.getEmpid() + "    Emp Name : " + e.getEname()
							+ "\tEmp Salary : " + e.getEsal() + "\t");
			}
			System.out.println();
			Employee1 max = Collections.max(emp);
			System.out.println("The Employee with maximum salary");
			System.out.println("   Emp ID : " + max.getEmpid() + "    Emp Name : " + max.getEname()
					+ "      Emp salary : " + max.getEsal() + "\tDNO : " + max.getDno());
			
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

 class Employee1 implements Serializable, Comparable<Employee1> {

	private static final long serialVersionUID = 1L;

	private int empid;
	private String ename;
	private double esal;
	private int dno;

	public Employee1() {

	}

	public Employee1(int empid, String ename, double esal, int dno) {
		this.empid = empid;
		this.ename = ename;
		this.esal = esal;
		this.dno = dno;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public int compareTo(Employee1 e) {
		if (this.getEsal() > e.getEsal())
			return 1;
		else if (this.getEsal() < e.getEsal())
			return -1;
		return 0;

	}

}