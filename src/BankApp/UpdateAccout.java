package BankApp;

import java.util.List;
import java.util.*;

public class UpdateAccout {
	List<Users> users;
	Scanner sc = new Scanner(System.in);

	public UpdateAccout(List<Users> users) {
		this.users = users;
	}

	void updateuser() {
		System.out.println("Enter username:");
		String uname = sc.next();
		System.out.println("Enter password:");
		String pswrd = sc.next();
		for (Users user : users) {
			// System.out.println("Name:" + user.name + ", Username:" + user.username + ",
			// balance:" + user.balance);
			if (user.username.equals(uname) && user.password.equals(pswrd)) {
				System.out.println("Enter the name : ");
				String name = sc.next();

				System.out.println();

			}

		}
	}
}
