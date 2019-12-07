/**
 * 
 */
package cert.ocp.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author gain
 *
 */
public class BinarySearch {

	/**
	 * 
	 */
	public BinarySearch() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] numbers={ 1,6,8,9};

// prints -2
		System.out.println(Arrays.binarySearch(numbers, 3));
		
		//Comparator<Integer> c = (x, y) ->  {y.intValue()—x.intValue();};
		Comparator<Integer> c =(x, y) -> Integer.compare(y, x);
		
		List<Integer> list = Arrays.asList(5, 4, 7, 1);
		Collections.sort(list, c);
		
		System.out.println("list "+list);
		
		System.out.println("Prints -1 or undefined value if the list is reverse descending order or not sorted ");
		//System.out.println("Prints -1 or undefined value if the list is reverse descending order sorted ");
		System.out.println(Collections.binarySearch(list, 1));
		
		Collections.sort(list);
		
		System.out.println("list "+list);
		System.out.println("Searching in  ascending order prints the right value ");
		
		System.out.println(Collections.binarySearch(list, 1));
		


	}

}
