package SerializationDemos;
public class ThreadEX extends Thread {
public void run() {
System.out.println("Hello");
public static void main(String[] args) {
ThreadEx t1 = new ThreadEx();
t1.start();
t1.stop();
t1.start();
}
}