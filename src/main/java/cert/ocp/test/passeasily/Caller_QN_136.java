package cert.ocp.test.passeasily;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

 public class Caller_QN_136 implements Callable<String> {
	
	String str;

	public Caller_QN_136(String s) {
		this.str = s;
	}

	public String call() throws Exception {
		return str.concat("Caller_QN_136");
	}
	
	public static void main (String[] args) throws  InterruptedException, ExecutionException
	{
	ExecutorService es = Executors.newFixedThreadPool(2);
	Future f1 = es.submit (new Caller_QN_136 ("Call"));
	Future f2 = es.submit (new Runner ("Run"));
	String str1 = (String) f1.get();
	String str2 = (String) f2.get(); //line n1
	System.out.println(str1+ ":" + str2);
	}
 }

class Runner implements Runnable {
	String str;

	public Runner(String s) {
		this.str = s;
	}

public void run () { 
	System.out.println (str.concat ("Runner"));
	}

}

