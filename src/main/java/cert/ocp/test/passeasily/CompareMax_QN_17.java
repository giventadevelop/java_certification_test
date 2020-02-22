/**
 * 
 */
package cert.ocp.test.passeasily;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * @author gain
 *
 */
public class CompareMax_QN_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(10,20,8);
		
		int maxInt=nums.stream().max(Comparator.comparing(a->a)).get();
		System.out.println(maxInt);
		
		String str1="Java Duke";
		
		System.out.println(str1.length());
	}

}
