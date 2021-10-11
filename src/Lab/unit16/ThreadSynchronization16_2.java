package Lab.unit16;

public class ThreadSynchronization16_2 {

	public static void main(String[] args) {
		MyThreadv thread1=new MyThreadv("thread1:");
		MyThreadv thread2=new MyThreadv("thread2:");
		thread1.start();
		thread2.start();
		
	}

}
class MyThreadv extends Thread
{
	static String message[]= {"java","is","hot","aromatic","and","invigorating."};
	public MyThreadv(String id) {
		super(id);
	
	}
	@Override
	public void run() {
		SynchronizationDisplay.displayList(getName(), message);
	}
}

class SynchronizationDisplay{
	public static synchronized void displayList(String name,String list[]) {
		for(int i=0;i<list.length;i++) {
			MyThreadv t=(MyThreadv)Thread.currentThread();
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+list[i]);
		}
	}
}





