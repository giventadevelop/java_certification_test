/**
 * 
 */
package cert.ocp.test.passeasily;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author gain
 *
 */
public class PrimitiveToObjCast_QN_16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Short s1 = 200;
		Integer s2 = 400;
		Long s3 = (long) s1 + s2; //line nl
		String s4 = (String) (s3 * s2); //line n2
		System.out.println("Sum is " + s4);

	}

}
