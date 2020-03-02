package cert.ocp.test.passeasily;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallerThread_QN_104 implements Callable<String> {
	String str;

	public CallerThread_QN_104(String s) {
		this.str = s;
	}

	public String call() throws Exception {
		return str.concat("Call");
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(4); // line nl
		Future fl = es.submit(new CallerThread_QN_104("Call"));
		String str = fl.get().toString();
		System.out.println(str);
		
		// The program execiutes and prints but won't terminate since the threads are not shut down so will
		//keep running in background waiting for new  tasks
	}
}