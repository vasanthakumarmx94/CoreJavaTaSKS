package Lab.unit15;

public class MultiThreadRunnable5_2 {

	public static void main(String[] args) throws InterruptedException {
		MyClass t1=new MyClass("thread1");
		MyClass t2=new MyClass("thread2");
		
		Thread thread1=new Thread(t1);
		Thread thread2=new Thread(t2);
		thread1.start();
		//thread1.join();
		thread2.start();
		

	}

}

class MyClass implements Runnable {
	static String message[] = { "java", "is", "hot", "aromatic" };
	String name;

	public MyClass(String id) {
		name = id;
	}

	@Override
	public void run() {
		for (int i = 0; i < message.length; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name + message[i]);
		}

	}

}