/**
 * 
 */
package cert.ocp.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author gain
 *
 */
public class ConcurrencySynchronised {

	/**
	 * 
	 */
	public ConcurrencySynchronised() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> syncList= Collections.synchronizedList(Arrays.asList(1,2,3));

		synchronized(syncList){
		for (int i : syncList){
		System.out.println( i );
		//  Both below lines will show  Exception in thread "main" java.lang.UnsupportedOperationException
		//syncList.add(i+2);
	//	syncList.remove(i);
		
		//  The below set operation works
		syncList.set(2, 2);
		}

	}
}
}
