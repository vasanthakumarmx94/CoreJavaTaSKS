package Lab.unit16;

public class Producer implements Runnable {

	Stock p;
	Thread t;
	Producer(Stock s){
		this.p=s;
		t=new Thread(this);//,"Producer Thread"
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
			p.addstock((int)(Math.random()*100));	
		}
	}
	void stop() {
		t.stop();
	}

}
