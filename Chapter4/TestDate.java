import java.time.*;
import java.time.temporal.*;

public class TestDate { 

	public static void main (String[] args) {

		System.out.println("*** Main ***");

		TestDate td = new TestDate();

		td.testDate("test");
		td.testInstant("test");
		


	}

	void testDate(String value) { 

		System.out.println("");
		System.out.println("*** testArray ***");

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());

		System.out.println("");
		System.out.println("");
		var date = LocalDate.of(2022, Month.JANUARY, 20);
		System.out.println(date); // 2022–01–20

		date = date.plusDays(2);
		System.out.println(date); // 2022–01–22
		date = date.plusWeeks(1);
		System.out.println(date); // 2022–01–29
		date = date.plusMonths(1);
		System.out.println(date); // 2022–02–28
		date = date.plusYears(5);
		System.out.println(date); // 2027–02–28

		var annually = Period.ofYears(1); // every 1 year
		var quarterly = Period.ofMonths(3); // every 3 months
		var everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
		var everyOtherDay = Period.ofDays(2); // every 2 days
		var everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days

		System.out.println("");
		System.out.println(annually);
		System.out.println(quarterly);
		System.out.println(everyThreeWeeks);
		System.out.println(everyOtherDay);
		System.out.println(everyYearAndAWeek);

		var date1 = LocalDate.of(2022, 1, 20);
		var time = LocalTime.of(6, 15);
		var dateTime = LocalDateTime.of(date1, time);
		var period = Period.ofMonths(1);

		System.out.println("");
		System.out.println(date1.plus(period)); // 2022–02–20
		System.out.println(dateTime.plus(period)); // 2022–02–20T06:15


		var daily = Duration.of(1, ChronoUnit.DAYS);
		var hourly = Duration.of(1, ChronoUnit.HOURS);
		var everyMinute = Duration.of(1, ChronoUnit.MINUTES);
		var everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
		var everyMilli = Duration.of(1, ChronoUnit.MILLIS);
		var everyNano = Duration.of(1, ChronoUnit.NANOS);

		System.out.println("\n** ChronoUnit **");
		System.out.println(daily);
		System.out.println(hourly);
		System.out.println(everyMinute);
		System.out.println(everyTenSeconds);
		System.out.println(everyMilli);
		System.out.println(everyNano);

	}

	void testInstant(String value) { 

		System.out.println("");
		System.out.println("*** testInstant ***");

		var date = LocalDate.of(2022, 5, 25);
		var time = LocalTime.of(11, 55, 00);
		var zone = ZoneId.of("US/Eastern");
		var zonedDateTime = ZonedDateTime.of(date, time, zone);
		var instant = zonedDateTime.toInstant(); // 2022–05–25T15:55:00Z
		System.out.println(zonedDateTime); // 2022–05–25T11:55–04:00[US/Eastern]
		System.out.println(instant); // 202–05–25T15:55:00Z

	}

		void testSavingTime(String value) { 

		System.out.println("");
		System.out.println("*** testInstant ***");

		var date = LocalDate.of(2022, Month.MARCH, 13);
		var time = LocalTime.of(1, 30);
		var zone = ZoneId.of("US/Eastern");
		var dateTime = ZonedDateTime.of(date, time, zone);
		
		System.out.println(dateTime); // 2022–03-13T01:30-05:00[US/Eastern]
		System.out.println(dateTime.getHour()); // 1
		System.out.println(dateTime.getOffset()); // -05:00

		dateTime = dateTime.plusHours(1);
		System.out.println(dateTime); // 2022–03-13T03:30-04:00[US/Eastern]
		System.out.println(dateTime.getHour()); // 3
		System.out.println(dateTime.getOffset()); // -04:00

	}

}