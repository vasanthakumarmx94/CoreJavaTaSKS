package Lab.unit16;

public class Stock {
	int goods = 0;

	public synchronized void getSock(int i) {
		goods = goods + i;
		System.out.println("Stock added:" + i);
		System.out.println("present Stock;" + goods+"\n");
		notify();
	}

	public synchronized int addstock(int j) {
		while (true) {
			if (goods >= j) {
				goods = goods - j;
				System.out.println("Stock taken away:" + j);
				System.out.println("Present stock:" + goods+"\n");
				break;
			} else {
				System.out.println("Stock not enough...");
				System.out.println("waiting for stocks to come...\n");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return goods;
	}

	public static void main(String[] args) {

		Stock s = new Stock();
		Producer p = new Producer(s);
		System.out.println();
		Consumer c = new Consumer(s);
		try {
			Thread.sleep(10000);
			p.stop();
			c.stop();
			p.t.join();
			c.t.join();
			System.out.println("Thread stoped");
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
