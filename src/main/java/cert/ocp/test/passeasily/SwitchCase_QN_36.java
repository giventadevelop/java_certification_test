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
public class SwitchCase_QN_36 {

		
	public static void main (String[] args) throws IOException {
		
int wd = 0;
		
		//String days[] = {"sun" , "mon", "wed", "sat"};
//, "mon", "wed", "sat"
		String days[] = {"sun", "mon", "wed" };
		
		for (String s:days) {
		switch (s) {
		case "sat":
		case "sun":
		wd--;
		break;
		case "mon":
		wd++;
		case "wed":
		wd += 2;
		}
		}
		System .out.println (wd) ;
		
		
}
	
}
		