/**
 * 
 */
package cert.ocp.test.passeasily;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author gain
 *
 */
public class LocalDate_QN_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LocalDate valentinesDay=LocalDate.of(2015, Month.FEBRUARY, 14);
		LocalDate nextYear=valentinesDay.plusYears(1);
		nextYear.plusDays(15);
		System.out.println(nextYear);
		
		// Prints 2016-02-14  answer A
		
	}

}
