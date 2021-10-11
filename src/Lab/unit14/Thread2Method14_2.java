package Lab.unit14;

class Thread1 extends Thread{
	String tname;
	Thread t;
	Thread1(String s){
		tname=s;
		t=new Thread(this,s);
		System.out.println("New thread:"+t);
		t.start();
	}
	
	@Override
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println(tname+":"+i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println(tname+"Exiting...");
		}
	}
}

public class Thread2Method14_2 {

	public static void main(String[] args) {
		Thread1 t1=new Thread1("One");
		Thread1 t2=new Thread1("Two");
		System.out.println("Thread t1 is Alive:"+t1.isAlive());
		System.out.println("Thread t2 is Alive:"+t2.isAlive());
		try {
			System.out.println("waiting for thread to finish...");
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			
		}
		System.out.println("Thread t1 is Alive:"+t1.isAlive());
		System.out.println("Thread t2 is Alive:"+t2.isAlive());
		System.out.println("Main thread exiting");
		
		

	}

}
