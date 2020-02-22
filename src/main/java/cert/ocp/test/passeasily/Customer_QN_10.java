package cert.ocp.test.passeasily;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Customer_QN_10 {
	
	private String fName;
	private String lName;
	private static int count;
	public Customer_QN_10(String first, String last)
	{
		fName = first;
		lName = last;
	    ++count;
	}
	static { count = 0; }
	public static int getCount() {return count; }
	
	
	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream fis=new FileInputStream("hhc.txt");
		
		InputStreamReader fisRdr=new InputStreamReader(fis);
		
		while(fisRdr.ready())
		
		Customer_QN_10 cl = new Customer_QN_10 ("Larry", "Smith");
		Customer_QN_10 c2 = new Customer_QN_10 ("Pedro", "Gonzales");
		Customer_QN_10 c3 = new Customer_QN_10 ("Penny", "Jones");
		Customer_QN_10 c4 = new Customer_QN_10 ("Lars", "Svenson");
		c4 = null;
		c3 = c2;
		System.out.println (Customer_QN_10.getCount ());
	
	}

}

