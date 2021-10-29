package bankVersion2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Login1 {

	String username;
	String password;
	Scanner sc = new Scanner(System.in);

	void loginAcc() throws FileNotFoundException, IOException, ClassNotFoundException {

		System.out.print("Enter username:");
		username = sc.next();
		System.out.print("Enter password:");
		password = sc.next();
		int f = 0;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BankDB/usersdb.db"));
		List<Users1> userlist = new ArrayList<Users1>();
		
		try {
			while (true) {
				Users1 user = (Users1) ois.readObject();
				userlist.add(user); // add readObject to list userlist
			}
			

		} catch (EOFException e) {

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ois.close();
		Base64.Decoder decoder = Base64.getDecoder();// java 8 feature Base64 ecryption and decryption
		// System.out.println(user1.getPassword());

		for (Users1 user : userlist) {
			String decypassword = new String(decoder.decode(user.getPassword()));
			if (user.getUsername().equals(username) && decypassword.equals(password)) {
				f = 1;
				// UserDashboard ud = new UserDashboard(username, users);
				UserDashboard1 ud = new UserDashboard1(username);
				System.out.println("Lagin successfully");
				ud.Dashboard();
			}
		}
		if(f==0) {
			System.err.println("User not exists....");
			loginAcc();
		}

	}

}
