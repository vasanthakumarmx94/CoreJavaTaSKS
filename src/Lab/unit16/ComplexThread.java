package Lab.unit16;

// Write a complex program to illustrate how the thread priorities?


public class ComplexThread extends Thread {

	private int delay;
	
	ComplexThread(String name,float seconds){
		super(name);
		delay=(int)seconds*1000; //delay are in milliseconds
		start();
		//Thread.currentThread().setPriority(delay);
		
	}
	
	@Override
	public void run() {
		int i=0;
		while(true) {
			System.out.println(Thread.currentThread().getName());
			//System.out.println(Thread.currentThread().getPriority());
			//Thread.currentThread().setPriority(delay);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				return ;
			}
			//break;
		}
		
	}

	public static void main(String[] args) {
		
		new ComplexThread("One orange",1.1F);
		new ComplexThread("Two orange",1.3F);
		new ComplexThread("Three orange",1.5F);
		new ComplexThread("four",0.7F);
		
	}

}
