/**
 * 
 */
package cert.ocp.test;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author gain
 *
 */
public class DateDuration {

	/**
	 * 
	 */
	public DateDuration() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		

		//Given the following code, which of the answer choices can fill in the blank to print true? (Choose all that apply.)

		String m1 = Duration.of(1, ChronoUnit.MINUTES).toString();

		String m2 = Duration.ofMinutes(1).toString();

		String s = Duration.of(60, ChronoUnit.SECONDS).toString();



		String d = Duration.ofDays(1).toString();

		String p = Period.ofDays(1).toString();



		System.out.println("m1 = "+ m1);
		
		System.out.println("m2 = "+ m2);
		
		System.out.println("s = "+ s);
		
		System.out.println("d = "+ d);
		
		System.out.println("p = "+ p);
		
		
		String s1 = "bunny";
		String s2 = "bunny";
		
		
		System.out.println(m1 == m2); // false because they are not string  which were initialised by quotes straight initialisation like "bunny"
		
		System.out.println("m1 == m2 "+ m1 == m2);
		
		System.out.println( s1 == s2); // true  because string pooling but see below
		
		System.out.println("s1 == s2 "+ s1 == s2);  // false operator precedence issue with +

	}

}
