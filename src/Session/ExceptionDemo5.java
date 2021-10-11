package Session;

class Account {
	private static int acc_balance = 0;

	public Account(int acc_balance) {
		super();
		this.acc_balance = acc_balance;
	}

	void withdraw(int ammount) {
		try {
			if (ammount > acc_balance) {
				throw new WithdrawException("Insufficient balance");
			}
			else {
				acc_balance=acc_balance-ammount;
			}
		} catch (WithdrawException w) {
			System.err.println(w);
			//System.out.println(w.getMessage());
		}
	}

	void showBalance() {
		System.out.println("Balance:"+acc_balance);
	}
}

class WithdrawException extends Exception {

	String msg;

	public WithdrawException(String msg) {
		super(msg);
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Withdraw Exception:" + msg;
	}
}

public class ExceptionDemo5 {

	public static void main(String[] args) {
		Account ac = new Account(25000); // initial balance
		System.out.println("pass withdraw ammount more than Acc_balance:");
		ac.withdraw(30000);
		System.out.println("");
		
		System.out.println("Pass withdraw ammount less than Acc_balance:");
		ac.withdraw(20000);
		ac.showBalance();
		System.out.println("");
		
		System.out.println("Again pass withdraw ammount More than Acc_balance:");
		ac.withdraw(10000);
		System.out.println("");

	}

}
