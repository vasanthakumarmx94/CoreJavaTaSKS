package bankVersion2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class RegisterAccount1 {

	Scanner sc = new Scanner(System.in);

	String name;
	String address;
	String contactno;
	String username;
	String password;
	double intdeptamt;
	String initdate;
	List<Users1> users;
	public static ArrayList<String> transactions1;

	public RegisterAccount1(List<Users1> users1) {
		this.users = users1;
	}

	void enterDetails() throws FileNotFoundException, IOException {

		System.out.print("Enter name:");
		name = sc.nextLine();
		System.out.print("Enter address:");
		address = sc.nextLine();
		while (true) {
			System.out.print("Enter Contact number:");
			contactno = sc.next(); // pattern for countryCode: ^[+]\\d{2,3}[-]\\d{10}
			if (contactno.matches("\\d{10}") == false) {
				System.err.println("Please Enter valid contact number");
				continue;
			} else {
				break;
			}
		}
		System.out.print("Enter username:");
		username = sc.next();

		while (true) {
			System.out.print("Enter password:");
			password = sc.next();
			if (password.length() >= 8) {
				if (password.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*_])).{8,20}")) {
					// one Uppercase,one digit, one sepecial characters must and minimum 8 characters legnth
					break;

				} else {
					System.err.println("please enter valid password");
				}

			} else {
				System.err.println("please enter valid password");
			}
		}
		System.out.print("Enter intial Deposit:");
		intdeptamt = sc.nextDouble();


		 ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("BankDB/usersdb.db")); // serialization concept
		// System.out.println(date);
		try {

			Base64.Encoder encoder = Base64.getEncoder(); // java 8 feature Base64 ecryption and decryption
			String encyPassword = encoder.encodeToString(password.getBytes());
			
			users.add(new Users1(name, address, contactno, username, encyPassword, intdeptamt, initdate));

			for (Users1 user : users)
				oos.writeObject(user);
			// System.out.println("serialization done");

			transactions1 = new ArrayList<String>(5);
			
			LocalDateTime date = LocalDateTime.now(); // java 8 feature LocalDateTime
			DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss");
			initdate = date.format(dateformat);

			UserDashboard1 ud = new UserDashboard1(transactions1);
			ud.addTransaction(String.format("Initial deposit - " + intdeptamt + " as on " + initdate));
			System.out.println("User Register sucsessfuly");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oos != null)
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
