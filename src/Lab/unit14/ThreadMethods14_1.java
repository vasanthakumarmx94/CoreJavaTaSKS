package Lab.unit14;

public class ThreadMethods14_1 {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("Current thread:"+t);
		System.out.println("Name of current thread:"+t.getName());
		System.out.println("Priority:"+t.getPriority());
		t.setName("mythread");
		System.out.println("After name change:"+t);
		t.setPriority(2);
		System.out.println("After priority change;"+t);
		System.out.println("Number of active thread:"+t.activeCount());
		

	}

}
