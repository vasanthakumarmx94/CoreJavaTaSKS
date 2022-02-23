package bankVersion2;

import java.util.*;

public class EnterBOption1 {

	Scanner sc = new Scanner(System.in);
	int selectOption() {

		System.out.println("-----------------------");
		System.out.println("BANK OF MYBANK");
		System.out.println("-----------------------");
		System.out.println("1.Register account");
		System.out.println("2.Login");
		System.out.println("3.Update account");
		System.out.println("4.Exit");

		//Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Choice:");
		int opt = sc.nextInt();
		if (opt <= 0 || opt > 5) {
			System.out.println("please choose correct option " + opt + " not found");
			selectOption();
		} else {
			return opt;
		}
		return 0;

	}

	int userOption() {

		System.out.println("-----------------------");
		System.out.println("W E L C O M E");
		System.out.println("-----------------------");
		System.out.println("1.Deposit");
		System.out.println("2.View Balance");
		System.out.println("3.Transfer");
		System.out.println("4.Last 5 transactions.");
		System.out.println("5.User information.");
		System.out.println("6.Logout ");
		//Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Choice:");
		int uopt = sc.nextInt();
		System.out.println();
		if (uopt <= 0 || uopt > 6) {
			System.out.println("please choose correct option " + uopt + " not found");
			selectOption();
		} else {
			return uopt;
		}
		return 0;

	}

}
