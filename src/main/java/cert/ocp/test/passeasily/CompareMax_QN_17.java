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
		
		double db=100.0f;
		double dC=new Double(100);
		boolean blTst=new Boolean(true);
		
		
		int nums1[] = new int[3];

		int nums2[] = {1, 2, 3, 4, 5};

		nums1 = nums2;

		System.out.println(" Print array elements");
		for (int x : nums1) {
		System.out.print(x + ":");

		}
		
		
		System.out.println(" Print 2D array elements  QN_76 ");
		int n [] [] = {{1, 3}, {2, 4}};
		for (int i = n.length-1; i >= 0; i--) {
		for (int y : n[i]) {
		System.out.print (y);
		}
		}
		
		
		
	}

}
