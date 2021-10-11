package Lab.unit16;

public class Consumer implements Runnable {

	Stock c;
	Thread t;
	Consumer(Stock c){
		this.c=c;
		t=new Thread(this);//, "producer thread"
		t.start();
		
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c.getSock((int)(Math.random()*100));
		}
		
	}
	void stop() {
		t.stop();
	}

}
