package BankApp;


import java.util.*;

public class BankmainApp {
	
	static List<Users> users = new ArrayList<Users>();

	public static void main(String[] args) {
		//users.add(new Users("Raghu", "Tumakur", "9897888766", "raghu123", "Raghu@123", 20000, "2021-45-14 01:45:55"));
		//users.add(new Users("Vasu", "Mysore", "9877833766", "vasu123", "Vasu@123", 10000, "2021-42-14 01:42:08"));
		
		selectOpt();
	}

	static void selectOpt() {
		EnterBOption Eo = new EnterBOption();
		int option = Eo.selectOption();
		switch (option) {
		case 1:
			RegisterAccount rg = new RegisterAccount(users);
			rg.enterDetails();
			selectOpt();
			break;
		case 2:
			 Login lg = new Login(users);
			 lg.loginAcc();
			break;
		case 3:
			UpdateAccout ua=new UpdateAccout(users);
		
			break;
		case 4:
			System.out.println("Your exit from application");
			break;
		}

	}
}
