/**
 * 
 */
package cert.ocp.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author gain
 *
 */
public class LocaleDateExamples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*dateTime1 is 2016–03–13T01:30–05:00[US/Eastern] and dateTime2 is 2016–03–13T03:30–04:00[US/Eastern]. While the values are two hours apart, the time zone offset changes as well, making it only change from 6:30 GMT to 7:30 GMT.*/
		
		ZoneId utcZoneID= ZoneId.of("Etc/UTC");
       
        // DateTime With Zone
       // ZonedDateTime utcDateAndTime = ausDateAndTime.atZone(utcZoneID);
		
		LocalDate date = LocalDate.of(2016, Month.MARCH, 13);

				LocalTime time = LocalTime.of(1, 30);

				ZoneId zone = ZoneId.of("US/Eastern");

				ZonedDateTime dateTime1 = ZonedDateTime.of(date, time, zone);
				
				//System.out.println( "dateTime1  to GMT / UST  - " + dateTime1.toLocalDateTime().atZone(utcZoneID));
				
				System.out.println( "dateTime1  after converting to to GMT / UST  - " + dateTime1.withZoneSameInstant(ZoneOffset.UTC));
				
				
				ZonedDateTime dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);

				System.out.println( "dateTime1 - " + dateTime1 );
				
				System.out.println( "dateTime2 - " + dateTime2 );
				
				long hours = ChronoUnit.HOURS.between(dateTime1, dateTime2);

				int clock1 = dateTime1.getHour();

				int clock2 = dateTime2.getHour();

				System.out.println("The hours after teh time change in DST are The hours calculated in GMT though " + hours + "," + clock1 + "," + clock2);

	}

}
