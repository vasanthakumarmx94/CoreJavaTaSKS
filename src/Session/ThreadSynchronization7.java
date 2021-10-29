package Session;


class MyThread extends Thread{
	int m,n;
	SharedResource s;
	

	public MyThread(int m, int n, SharedResource s) {
		super();
		this.m = m;
		this.n = n;
		this.s = s;
	}

	@Override
	public void run() {
		s.doprint(m, n);
	}
	
}
class SharedResource {
	synchronized void doprint(int m,int n) {
		System.out.println(n+" digits are added in sequence after "+m);
		//int count=0;
		for(int i=0;i<=n;i++) {
			System.out.print(m+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			m=m+1;
			
			}
		System.out.println("\n");
		}
	}

public class ThreadSynchronization7 {

	public static void main(String[] args) {
		
		SharedResource s=new SharedResource();
		
		MyThread t1 = new MyThread(2,5,s);
		MyThread t2 = new MyThread(3,7,s);
		t1.start();
		System.out.println();
		t2.start();

	}

}
