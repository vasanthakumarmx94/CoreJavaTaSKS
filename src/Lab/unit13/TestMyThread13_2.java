package Lab.unit13;

class MyThread extends Thread{
	MyThread(){
		super("Using Thread Child ");
		System.out.println("Chiald thread:"+this);
		start();
	}

	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Child Thread:"+i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Exit child Thread....");
		}
	}
}
public class TestMyThread13_2 {
	public static void main(String[] args) {
		new MyThread();
		try {
			for(int j=5;j>0;j--) {
				System.out.println("Running main thread:"+j);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println("Exiting main thread...");
		}
	}
}
