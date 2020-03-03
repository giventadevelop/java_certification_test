/**
 * 
 */
package cert.ocp.test.passeasily;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

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
		System.out.println ("  QN 143" );
		ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 3, 0, 0, 0, ZoneId.of("UTC-7"));
				ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-5"));
				long hrs = ChronoUnit.HOURS.between(depart, arrive); //line n1
				System.out.println("Travel time is" + hrs + "hours");
		
	}

}
