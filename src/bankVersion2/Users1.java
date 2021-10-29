package bankVersion2;

import java.io.Serializable;

public class Users1 implements Serializable{
	private static final long serialVersionUID=1L;    //serialization this class implements Serializable interface
	String name;
	String address;
	String contactno;
	String username;
	String password;
	double balance;
	String initDate;
	

	public Users1(String name, String address, String contactno, String username, String password, double intdeptamt,String initDate) {
		super();
		this.name = name;
		this.address = address;
		this.contactno = contactno;
		this.username = username;
		this.password = password;
		this.balance = intdeptamt;
		this.initDate = initDate;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public double setBalance(double balance) {
		return this.balance = balance;
	}

	public String getInitDate() {
		return initDate;
	}

	public void setInitDate(String initDate) {
		this.initDate = initDate;
	}

	@Override
	public String toString() {
		return "Users [name=" + name + ", address=" + address + ", contactno=" + contactno + ", username=" + username
				+ ", password=" + password + ", balance=" + balance + ", initDate=" + initDate + "]";
	}
	
	
}
