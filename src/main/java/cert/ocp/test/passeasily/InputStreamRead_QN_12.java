package cert.ocp.test.passeasily;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class InputStreamRead_QN_12 {
	
	private String fName;
	private String lName;
	private static int count;
	public InputStreamRead_QN_12(String first, String last)
	{
		fName = first;
		lName = last;
	    ++count;
	}
	static { count = 0; }
	public static int getCount() {return count; }
	
	
	public static void main(String[] args) {
	
		int i;
	char c;
	try (FileInputStream fis = new FileInputStream ("C:\\code_backup\\java_ocp_test\\path_copy_dest\\path_copy_src\\course.txt");
	InputStreamReader isr = new InputStreamReader(fis);) {
	while (isr.ready()) { //line n1
	isr.skip(2);
	i = isr.read ();
	c = (char) i;
	System.out.print(c);
	}
	} catch (Exception e) {
	e.printStackTrace();
	}
	}

}
