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

		String Duration_of_1_min = Duration.ofMinutes(1).toString();

		String Duration_of_60_sec
				= Duration.of(60, ChronoUnit.SECONDS).toString();
		
		String Duration_of_3600_sec
		= Duration.of(3600, ChronoUnit.SECONDS).toString();




		String Duration_of_1_day = Duration.ofDays(1).toString();

		String p = Period.ofDays(1).toString();



		System.out.println("m1 = "+ m1);
		
		System.out.println("Duration_of_1_min = "+ Duration_of_1_min);
		
		System.out.println("Duration_of_60_sec = "+ Duration_of_60_sec);
		
		System.out.println("Duration_of_1_day = "+ Duration_of_1_day);
		
		System.out.println("Duration_of_3600_sec = "+ Duration_of_3600_sec);
		
		System.out.println("p = "+ p);
		
		
		String s1 = "bunny";
		String s2 = "bunny";
		
		
		System.out.println(m1 == Duration_of_1_min); // false because they are not string  which were initialised by quotes straight initialisation like "bunny"
		
		System.out.println("m1 == m2 "+ m1 == Duration_of_1_min);
		
		System.out.println( s1 == s2); // true  because string pooling but see below
		
		System.out.println("s1 == s2 "+ s1 == s2);  // false operator precedence issue with +

	}

}
