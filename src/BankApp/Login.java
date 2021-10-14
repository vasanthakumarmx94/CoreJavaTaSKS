package BankApp;

import java.util.*;

public class Login {

	String username;
	String password;
	List<Users> users;

	Scanner sc = new Scanner(System.in);

	public Login(List<Users> users2) {
		this.users = users2;
		System.out.println();
	}

	void loginAcc() {
		int f = 0;
		System.out.print("Enter username:");
		username = sc.next();

		System.out.print("Enter password:");
		password = sc.next();
		for (Users user : users) {
			//System.out.println("Name:" + user.name + ", Username:" + user.username + ", balance:" + user.balance);
			if (user.username.equals(username) && user.password.equals(password)) {
				f=1;
				
			}
		}
		if (f == 1) {
			UserDashboard ud = new UserDashboard(username, users);
			System.out.println("Lagin successfully");
			ud.Dashboard();
			
		} else {
			System.err.println("Invalid Login");
			loginAcc();
		}

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
