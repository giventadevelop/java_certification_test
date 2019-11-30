/**
 * 
 */
package cert.ocp.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author gain
 *
 */
public class SynchronisedCollectionIterate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		List<String> syncCollection = Collections.synchronizedList(Arrays.asList("a", "b", "c"));
		List<String> uppercasedCollection = new ArrayList<>();
		   
		Iterator  SynchronisedCollectionIterator= syncCollection.iterator();
		
		
		 while(SynchronisedCollectionIterator.hasNext()){
			 System.out.println(SynchronisedCollectionIterator.next() );
			 // Exception in thread "main" java.lang.UnsupportedOperationException
			 //syncCollection.add("b");
			 syncCollection.set(0, "b");
		 }
		/* synchronized (SynchronisedCollectionIterate.class){
			 
			
			 
		 }*/
		
		
		Runnable listOperations = () -> {
		    synchronized (SynchronisedCollectionIterate.class) {
		        syncCollection.forEach((e) -> {
		            uppercasedCollection.add(e.toUpperCase());
		            //Exception in thread "main" java.lang.UnsupportedOperationException
		            //syncCollection.add("a");
		        });
		    }
		};

		
		Thread thread1 = new Thread(listOperations);
	    thread1.start();
	    
System.out.println("syncCollection "+ syncCollection ) ;
		
		System.out.println("uppercasedCollection "+ uppercasedCollection ) ;
		
		Arrays.asList("c","c","c").parallelStream().map(x->{syncCollection.add(x);return x;});
		
		System.out.println("syncCollection "+ syncCollection ) ;
		
		for(String e :syncCollection ){
			System.out.println("e "+ e ) ;
		}
	}

}
