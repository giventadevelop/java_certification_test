package cert.ocp.test.passeasily;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread_QN_150 implements Runnable {
	
	private static AtomicInteger count = new AtomicInteger (0);
	public void run () {
	int x = count.incrementAndGet();
	System.out.print (x+" ");
	}
	

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new MyThread_QN_150());Thread thread2 = new Thread(new MyThread_QN_150());
		Thread thread3 = new Thread(new MyThread_QN_150());
		Thread [] ta = {thread1, thread2, thread3};
		for (int x= 0; x < 3; x++) {
		ta[x].start();
		}
	}
}