package Lab.unit15;

public class ThreadTest15_1 {

	public static void main(String[] args) {

		MyThread thread1 = new MyThread("thread1:");
		MyThread thread2 = new MyThread("thread2:");
		thread1.start();
		thread2.start();
		boolean thread1IsActive = true;
		boolean thread2IsActive = true;
		do {
			if (thread1IsActive && !thread1.isAlive()) {
				thread1IsActive = false;
				System.out.println("Thread 1 is dead");
			}
			if (thread2IsActive && !thread2.isAlive()) {
				thread2IsActive = false;
				System.out.println("Thread 2 is dead");
			}
		} while (thread1IsActive || thread2IsActive);

	}

}

class MyThread extends Thread {
	String message[] = { "Java", "is", "hot", "aromatic", "and", "invigorating" };

	public MyThread(String id) {
		super(id);

	}

	@Override
	public void run() {
		String name = getName();
		for (int i = 0; i < message.length; i++) {
			randomWait();
			System.out.println(name + message[i]);
		}

	}

	void randomWait() {
		try {
			sleep((long) (3000 * Math.random()));

		} catch (InterruptedException x) {
			System.out.println("Interrupted!!");
		}
	}

}