/**
 * 
 */
package cert.ocp.test.passeasily;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
		
	
	
	//QN 134
		System.out.print ("   ");
		System.out.print ("  QN 134 ");
	StringBuilder sb = new StringBuilder(5);
	String s = "";
	if (sb.equals(s)) {
	System.out.println("Match 1");
	} else if (sb. toString().equals(s.toString())) {
	System.out.println("Match 2");
	} else {
	System.out.println("No Match");
	}
	
	
	//QN 135
	System.out.print ("   ");
	System.out.print ("  QN 135 ");
	
	Moveable<Integer> animal = n-> System.out.println("Running" );
	animal.run(100);
	animal.walk(20);
	
/*	Moveable<Integer> animal = n-> n+10;
	animal.run(100);
	animal.walk(20);*/
	
	//QN 139
	//java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay
		System.out.print ("   ");
		System.out.print ("  QN 139 ");
		String dateTime = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
		System. out. println (dateTime);
	
	//QN 137
	System.out.print ("   ");
	System.out.print ("  QN 137 ");
	LocalDate date = LocalDate.of(2012, 1, 32);
	date.plusDays (10);
	System. out.println (date) ;
	
	
	
}
	
}

 interface Moveable<Integer> {
public default void walk (Integer distance) {System.out.println("Walking");}
public void run(Integer distance);
}
		