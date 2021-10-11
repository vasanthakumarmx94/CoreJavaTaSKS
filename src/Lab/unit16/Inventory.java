package Lab.unit16;

 class Inventory {

	 static int qutyoh=500;
	 static int req=0;
	 
	 static public synchronized void request(int order) {
		 if(order<=qutyoh) {
			 System.out.println("Ordered quantity:"+order);
			 qutyoh=qutyoh-order;
			 req=req+order;
			 System.out.println("Quantity on hand:"+qutyoh);
			 System.out.println("Total quantity taken away orders: "+req);
		 }
		 else {
			 System.out.println("Ordered quantity more than quantity on hand");
		 }
	 }
	 
	public static void main(String[] args) {
		
		new MyThread();
		//new MyThread();
//		try {
//			for(int p=3;p>0;p--) {
//				System.out.println("======================");
//				System.out.println("main Thread"+p);
//				System.out.println("======================");
//				
//			Thread.sleep(1000);
//			}
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.out.println("exiting Main thread.... ");
//		}

	}

}
 class MyThread extends Thread{
	 MyThread(){
		 super("test thread");
		 System.out.println("child thread:"+this);
		 start();
	 }

	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Inventory.request((int)(Math.random()*100));
		}
	}
	 
 }
