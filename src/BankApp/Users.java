package BankApp;

import java.text.NumberFormat;
import java.util.*;

public class Users {
	String name;
	String address;
	String contactno;
	String username;
	String password;
	double balance;
	String initDate;
	//ArrayList<String> transactions;

	public Users(String name, String address, String contactno, String username, String password, double intdeptamt,String initDate) {
		super();
		this.name = name;
		this.address = address;
		this.contactno = contactno;
		this.username = username;
		this.password = password;
		this.balance = intdeptamt;
		this.initDate = initDate;
		
	}
	
}
