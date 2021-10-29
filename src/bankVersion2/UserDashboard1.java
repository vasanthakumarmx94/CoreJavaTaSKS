package bankVersion2;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserDashboard1 {

	Scanner sc = new Scanner(System.in);
	int depamt;
	int tramt;
	String payuname;
	String username;

	public static ArrayList<String> transactions1;
	Users1 u;

	public UserDashboard1(String username) {
		this.username = username;
	}

	public UserDashboard1(ArrayList<String> transactions2) {
		transactions1 = transactions2;

	}

	void Dashboard() throws FileNotFoundException, IOException, ClassNotFoundException {
		EnterBOption1 Eo = new EnterBOption1();
		int option1 = Eo.userOption();

		switch (option1) {
		case 1:
			deposit();
			Dashboard();
			break;
		case 2:
			viewbalance();
			Dashboard();
			break;
		case 3:
			transfer();
			Dashboard();
			break;
		case 4:
			for (String transaction : transactions1) {
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
			BankmainApp1.selectOpt();
			break;
		}
	}

	private void viewbalance() throws FileNotFoundException, IOException, ClassNotFoundException {
		@SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BankDB/usersdb.db"));

		while (true) {
			Users1 use = (Users1) ois.readObject();
			if (use.getUsername().equals(username)) {
				System.out.println("Your Bank Balance:" + use.getBalance());
				break;
			}

		}

	}

	/*
	 * deposit to user account by reading object and again write objects. from
	 * userdb.db file and store
	 */

	void deposit() throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("Enter amount:");
		depamt = sc.nextInt();
		List<Users1> userlist = new ArrayList<Users1>();// created one list and read all objects to it
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BankDB/usersdb.db"));
		// userlist = (ArrayList<Users>) ois.readObject();

		try {
			while (true) {
				Users1 user = (Users1) ois.readObject();
				userlist.add(user); // add readObject to list lst
			}

		} catch (EOFException e) {

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Users1 user : userlist) {
			if (user.username.equals(username)) {

				user.balance = user.balance + depamt;
				LocalDateTime date = LocalDateTime.now(); // java 8 feature LocalDateTime
				DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss");
				String initdate = date.format(dateformat);
				addTransaction(String.format(
						depamt + " credited to your account. Balance = " + user.balance + " as on " + initdate));
				System.out.println(depamt + " Deposited successfully to " + user.name);

			}
		}
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("BankDB/usersdb.db"));
		for (Users1 u : userlist)
			oos.writeObject(u);
		oos.close();
		ois.close();

	}

	void userInfo() throws FileNotFoundException, IOException {

		@SuppressWarnings("resource") // java 8 feature annotation
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BankDB/usersdb.db"));
		List<Users1> lst = new ArrayList<Users1>();// created one list and add all objects to it
		try {
			while (true) {
				Users1 user = (Users1) ois.readObject();
				lst.add(user); // add readObject to list lst
			}

		} catch (EOFException e) {

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// java 8 feature filter ,stream usage
		lst.stream().filter(el -> el.getUsername().equals(username))
				.forEach(ele -> System.out.println("Account holder Name:" + ele.getName() + "\n Account holder Address:"
						+ ele.getAddress() + "\n Account Holder Contact:" + ele.getContactno()
						+ "\n Account Holder UserName:" + ele.getUsername()));

	}

	public void addTransaction(String message) {
		transactions1.add(0, message);
		if (transactions1.size() > 5) {
			transactions1.remove(5);
			transactions1.trimToSize();
		}

	}

	void transfer() throws FileNotFoundException, IOException {
		System.out.print("Enter pay Username :");
		payuname = sc.next();
		System.out.print("Enter transfer amount:");
		tramt = sc.nextInt();
		int f = 0;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BankDB/usersdb.db"));
			List<Users1> userlist = new ArrayList<Users1>();// created one list and add all objects to it

			try {
				while (true) {
					Users1 user = (Users1) ois.readObject();
					userlist.add(user); // add readObject to list userlist
				}

			} catch (EOFException e) {

			} catch (IOException e) {

				e.printStackTrace();
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}

			ois.close();

			// userlist = (List<Users>) ois.readObject();
			for (Users1 ul : userlist) {
				if (ul.username.equals(payuname)) {

					// user.balance = user.balance + tramt;
					System.out.println(tramt + " transfer to " + payuname);
					LocalDateTime date1 = LocalDateTime.now(); // java 8 feature LocalDateTime
					DateTimeFormatter dateformat1 = DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss");
					String initdate1 = date1.format(dateformat1);
					addTransaction(String.format(tramt + " transfer to " + payuname + " as on " + initdate1));

					ul.balance = ul.balance + tramt;

					for (Users1 el : userlist) {
						if (el.username.equals(username)) {
							el.balance = el.balance - tramt;
							System.out.println("Your Balance is:" + el.balance);
							f = 1;
						}
					}
				}

			}
			if (f == 1) {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("BankDB/usersdb.db"));
				for (Users1 u : userlist)
					oos.writeObject(u);
				oos.close();
			}
			if (f == 0) {
				System.err.println("User does not exists");
			}

		} catch (EOFException e) {

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
