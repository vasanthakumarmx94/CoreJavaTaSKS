package Session;

class Thread1 extends Thread {

	String str;

	public Thread1(String str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {
		try {
			System.out.println("Thread1 reverse the 'Java is nice'in order with pause of 2 seconds:Wait ");
			int n = str.length();
			// create a character array of the same size as that of string
			char[] temp = new char[n];
//			for(int i=n-1;i>=0;i--)
//			{
//				System.out.print(str.charAt(i));
//				Thread.sleep(2000);
//			}
			// fill character array backward with characters in the string
			for (int i = 0; i < n; i++) {
				temp[n - i - 1] = str.charAt(i);
			}
			Thread.sleep(2000);
			System.out.println(String.copyValueOf(temp));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Thread2 extends Thread {
	String str;

	public Thread2(String str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {
		try {
			System.out.println("Thread2 to execute 'Java is nice' with alternate characters with pause of 1 second. ");
			int n = str.length();

			// create a character array of the same size as that of string
			char[] temp = new char[n];
//			for(int i=n-1;i>=0;i--)
//			{
//				System.out.print(str.charAt(i));
//				Thread.sleep(2000);
//			}
			// fill character array backward with characters in the string
			for (int i = 0; i < n; i = i + 2) {
				temp[i] = str.charAt(i);
			}
			Thread.sleep(1000);
			System.out.println(String.copyValueOf(temp)); // j v s n c
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

public class MultiThreadTask6 {

	public static void main(String[] args) {
		Thread1 th1 = new Thread1("Java is nice");
		th1.start();
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();

		Thread2 th2 = new Thread2("Java is nice");
		th2.start();
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
