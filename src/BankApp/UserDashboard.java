package BankApp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import BankApp.BankmainApp;

public class UserDashboard {

	Scanner sc = new Scanner(System.in);
	int depamt;
	int tramt;
	String payname;
	String username;
	List<Users> users;
	public static ArrayList<String> transactions;
	Users u;

	public UserDashboard(String username, List<Users> users) {
		this.users = users;
		this.username = username;
	}

	public UserDashboard(ArrayList<String> transactions2) {
		this.transactions = transactions2;

	}

	void Dashboard() {
		EnterBOption Eo = new EnterBOption();
		int option1 = Eo.userOption();

		switch (option1) {
		case 1:
			Date date = Calendar.getInstance().getTime();
			DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			String initdate = dateFormat.format(date);
			deposit(initdate);
			Dashboard();
			break;
		case 2:
			viewbalance();
			Dashboard();
			break;
		case 3:
			Date date1 = Calendar.getInstance().getTime();
			DateFormat dateFormat1 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			initdate = dateFormat1.format(date1);
			transfer(initdate);
			Dashboard();
			break;
		case 4:
			for (String transaction : transactions) {
				System.out.println(transaction);
			}
			Dashboard();
			break;
		case 5:
			userInfo();
			Dashboard();
			break;
		case 6:
			// BankmainApp bkm=new BankmainApp();
			System.out.println("THANK YOU.....");
			BankmainApp.selectOpt();
			break;
		}
	}

	private void viewbalance() {
		for (Users user : users) {
			if (user.username.equals(username)) {
				System.out.println("Your Bank Balance:"+user.balance);
				
			}
		}

	}

	void deposit(String initdate) {
		System.out.println("Enter amount:");
		depamt = sc.nextInt();
		for (Users user : users) {
			// System.out.println("Name:"+user.name+", Username:"+user.username+",
			// balance:"+user.intdeptamt+", uuu"+this.username);
			if (user.username.equals(username)) {
				user.balance = user.balance + depamt;
				addTransaction(String.format(
						depamt + " credited to your account. Balance - " + user.balance + " as on " + initdate));
				System.out.println(depamt + " Deposited successfully to " + user.name);
				// System.out.println(user.intdeptamt);
			}
		}

	}

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return this.username+" ,"+user;
//	}

	void userInfo() {
		for (Users user : users) {
			if (user.username.equals(username)) {
				System.out.println("Account Holder Name:" + user.name);
				System.out.println("Account Holder Address:" + user.address);
				System.out.println("Account Holder contact:" + user.contactno);
			}
		}

	}

	public static void addTransaction(String message) {
		transactions.add(0, message);
		if (transactions.size() > 5) {
			transactions.remove(5);
			transactions.trimToSize();
		}

	}

	void transfer(String initdate) {
		System.out.println("Enter payee Uname :");
		payname = sc.next();
		System.out.println("Enter transfer amount:");
		tramt = sc.nextInt();
		int f = 0;
		for (Users user : users) {
			// System.out.println("Name:" + user.name + ", Username:" + user.username + ",
			// balance:" + user.intdeptamt);
			if (payname.equals(user.username)) {
				user.balance = user.balance + tramt;
				System.out.println(tramt + " transfer to " + payname);
				addTransaction(String.format(tramt + " transfer to to " + payname + " as on " + initdate));
				f = 1;
			}
		}
		if (f == 1) {
			for (Users user : users) {
				if (username.equals(user.username)) {
					user.balance = user.balance - tramt;
					System.out.println("Your Balance is:" + user.balance);
				}
			}
		} else {
			System.err.println("User does not exists");
		}
	}
}
