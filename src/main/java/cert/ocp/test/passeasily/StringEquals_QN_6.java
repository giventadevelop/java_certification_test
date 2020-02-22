/**
 * 
 */
package cert.ocp.test.passeasily;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author gain
 *
 */
public class StringEquals_QN_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		StringBuilder sbl = new StringBuilder ("Duke");
		String str1 = sbl.toString();
		// 9. 1/ insert code here
		//String str2="Duke";
		//String str2=sbl.toString();
		
		//String str2=new String(str1);
		
		String str2=str1;
		
		 System.out.print (str1 +"--"+ str2) ;
		 System.out.print (str1 == str2) ; 
		 
		 //Which code fragment, when inserted at line 9, enables the code to print true? A. String str2 str1; B. String str2new String (str1) C. String str2 sb1. toString 0 D. String str2 - "Duke"

	}

}
