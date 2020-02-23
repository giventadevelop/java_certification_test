package cert.ocp.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DateTime {

	public static void main(String[] args) {
		
		Period period = Period.ofDays(3);
		LocalDate time = LocalDate.now();
		LocalDate newTime;
		newTime = time.plus(period);
	
		System.out.println("period  "+ period );
		System.out.println("time  "+ time );
		System.out.println("newTime   "+ newTime );
		
		LocalDate startDate = LocalDate.of(2015, 2, 20);
		LocalDate endDate = LocalDate.of(2017, 1, 15);
		Period periodBetween = Period.between(startDate, endDate);
		
		System.out.println("periodBetween  "+ periodBetween );
		System.out.println("time  "+ time );
		System.out.println("newTime   "+ newTime );
	
		/*The Duration class represents an interval of time in seconds or nanoseconds and is most suited for handling shorter amounts of time, in cases that require more precision.
		We can determine the difference between two instants as a Duration object using the between() method:
*/      
		//Duration durationSample = Duration.of(2,TemporalUnit);
		Duration fiveMinutes = Duration.ofMinutes(5);
		Duration fiveDays = Duration.of(5, ChronoUnit.DAYS);
		Duration days = Duration.ofDays(4);
		days.plus(fiveMinutes).plus(fiveDays);
		
		System.out.println("Duration Print   "+ days );
		
		Instant start = Instant.parse("2017-10-03T10:15:30.00Z");
		Instant end = Instant.parse("2017-10-03T10:16:30.00Z");
		         
		Duration durationBetween = Duration.between(start, end);
		
		System.out.println("durationBetween   "+ durationBetween );
		
		Duration durationOfSeconds = Duration.ofSeconds(3600);
		
		System.out.println("durationOfSeconds   "+ durationOfSeconds );
		
        Duration durationOfMinutes = Duration.ofMinutes(90);
		
		System.out.println("durationOfMinutes   "+ durationOfMinutes );
		
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
		
		System.out.println("zonedDateTimeNow   "+ zonedDateTimeNow );
		
		Instant instantNow = Instant.now();
		
		System.out.println("instantNow   "+ instantNow );

	}

}
