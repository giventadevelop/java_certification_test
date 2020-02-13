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
public class BufferedReader_QN_34 {

		
	public static void main (String[] args) throws IOException {
		BufferedReader brCopy = null;
		try (BufferedReader br = new BufferedReader (new FileReader ("C:\\code_backup\\java_ocp_files\\employee.txt"))) { 		//line nl
		br.lines().forEach(c -> System.out.println(c));
		brCopy = br; //line n2
		}
		brCopy.ready (); //line n3;
		}
		
}
		