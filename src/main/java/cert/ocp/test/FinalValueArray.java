/**
 * 
 */
package cert.ocp.test;

import java.util.stream.IntStream;

/**
 * @author gain
 *
 */
public class FinalValueArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
				
				final long[] value2 = {0};
				
				final long  value3 = 0;
				IntStream.iterate(1, i -> 1).limit(6).parallel().forEach(i -> ++value2[0]);
				System.out.println(" "+value2[0]);
				//he final local variable value3
				//cannot be assigned. It must be blank and not using a compound assignment
				//value3=4;
	}

}
