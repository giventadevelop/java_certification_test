/**
 * 
 */
package cert.ocp.test.passeasily;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.BiFunction;

/**
 * @author gain
 *
 */
public class SwitchCase_QN_36 {

		
	public static void main (String[] args) throws IOException {
		
int wd = 0;
		
		//String days[] = {"sun" , "mon", "wed", "sat"};
//, "mon", "wed", "sat"
		String days[] = {"sun", "mon", "wed", "sat" };
		
		for (String s:days) {
		switch (s) {
		case "sat":
		case "sun":
		wd-=1;
		break;
		case "mon":
		wd++;
		case "wed":
		wd += 2;
		}
		}
		System .out.println (wd) ;
//		BiFunction<Integer, Double, Integer> val = (t1, t2) -> t1 + t2;//line n1
//		System.out.println(val.apply(10, 10.5));
//		
		
}
	
}
		