package Lab.unit13;

class Thread1 implements Runnable
{

	Thread t;
	Thread1(){
		t=new Thread(this,"Test Thread");
		System.out.println("Child thread:"+t);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Child Thread:"+i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Exit child thread......");
		}
		
	}
	
}


public class ThreadUsingRunnable13_1 {

	public static void main(String[] args) {
		
		
		Thread1 th1=new Thread1();
		
//		try {
//			for(int j=5;j>0;j--) {
//				System.out.println("Main Thread:"+j);
//				Thread.sleep(1000);
//				
//			}
//		}catch(InterruptedException e) {
//			System.out.println("main thread exiting..");
//		}
		
		
		
	}

}
