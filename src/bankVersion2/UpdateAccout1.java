package bankVersion2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class UpdateAccout1 {
	
	Scanner sc = new Scanner(System.in);


	void updateuser() throws FileNotFoundException, IOException {
		System.out.println("Enter username:");
		String uname = sc.next();
		System.out.println("Enter password:");
		String pswrd = sc.next();

		List<Users1> userlist = new ArrayList<Users1>();// created one list and read all objects to it
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BankDB/usersdb.db"));

		try {
			while (true) {
				Users1 user = (Users1) ois.readObject();
				userlist.add(user); // add readObject to list lst
			}

		} catch (EOFException e) {

		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

		for (Users1 user : userlist) {
			Base64.Decoder decoder = Base64.getDecoder();// java 8 feature Base64 ecryption and decryption
			// System.out.println(user1.getPassword());
			String decypassword = new String(decoder.decode(user.getPassword()));

			if (user.username.equals(uname) && decypassword.equals(pswrd)) {
				System.out.print("Enter the Updated name : ");
				String name = sc.next();
				System.out.print("Enter the Updated Address:");
				String Address = sc.next();
				System.out.print("Enter the Updated PhoneNo:");
				String contactno = sc.next();
				System.out.print("Enter the Updated password:");
				String password = sc.next();

				user.name = name;
				user.address = Address;
				user.contactno = contactno;
				Base64.Encoder encoder = Base64.getEncoder(); // java 8 feature Base64 ecryption and decryption
				String encyPassword = encoder.encodeToString(password.getBytes());
				user.password = encyPassword;
				System.out.println("Updated Successfully...");

			}

		}
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("BankDB/usersdb.db"));
		for (Users1 u : userlist)
			oos.writeObject(u);
		
		oos.close();
		ois.close();
	}
}
