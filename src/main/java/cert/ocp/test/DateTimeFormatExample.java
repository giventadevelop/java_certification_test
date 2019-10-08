package cert.ocp.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatExample {

	public static void main(String[] args) {
		LocalDate anotherSummerDay = LocalDate.of(2016, 8, 23);
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(anotherSummerDay));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(anotherSummerDay));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(anotherSummerDay));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(anotherSummerDay));
		
		LocalTime anotherTime = LocalTime.of(13, 12, 45);
		ZonedDateTime zonedDateTime = ZonedDateTime.of(anotherSummerDay, anotherTime, ZoneId.of("Europe/Helsinki"));
		System.out.println(
		  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)
		  .format(zonedDateTime));
		System.out.println(
		  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
		  .format(zonedDateTime));
		System.out.println(
		  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
		  .format(zonedDateTime));
		System.out.println(
		  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
		  .format(zonedDateTime));

   //ISO Date time
		
		DateTimeFormatter isoDateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
	    DateTimeFormatter isoDateFormat = DateTimeFormatter.ISO_DATE;

	   
	    LocalDateTime now = LocalDateTime.now();

	 
	    String dateTimeFormat = now.format(isoDateTimeFormatter);
	    System.out.println(dateTimeFormat);

	    String dateFormat = now.format(isoDateFormat);
	    System.out.println(dateFormat);
		
		
	}

}
