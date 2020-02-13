/**
 * 
 */
package cert.ocp.test.passeasily;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author gain
 *
 */
public class ArrayIndexCheck_QN_39 {

		
	public static void main (String[] args) throws IOException {
		
		int[] arr = {1, 2, 3, 4};

		int i = 0;

		do {
		System.out.print (arr[i] + " ");
		i++;

		} while (i < arr.length - 1);
		}
}
		
		