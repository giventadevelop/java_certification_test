/**
 * 
 */
package cert.ocp.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author gain
 *
 */
public class ListAndCollections {

	/**
	 * 
	 */
	public ListAndCollections() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//  subtypes are allowed with this expression
	
	//  Both below Set declarations works 
		Set<Number> numbers = new HashSet<>();
		//  with below gives Type mismatch: cannot convert from element type Object to Number
		//in the for loop below
		//Set numbers = new HashSet<Number>();
		numbers.add(new Integer(2));
		
		for(Number n: numbers)
			System.out.println(n);
		
	}

}
