package datemethods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.testng.annotations.Test;

public class DateTest {
	@Test
	public void printLastSixBusinessDates() {
		Date date = new Date();
		System.out.println("date: " + date);
		System.out.println("last working day: " + getPreviousWorkingDay(date));
	}

	public Date getPreviousWorkingDay(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);

		int dayOfWeek;
		do {
			cal.add(Calendar.DAY_OF_MONTH, -1);
			dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		} while (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY);

		return cal.getTime();
	}

	@Test
	public void printLastBusinessDaysTest() {
		int[] days = getLastSixBusinessDays(6);
		for (int day : days)
			System.out.println(day);
	}

	public int[] getLastSixBusinessDays(int totalPreviousDays) {
		int lastSixBusinessDays[] = new int[totalPreviousDays];
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		for (int dayCounter = 0; dayCounter < 6; dayCounter++) {
			int dayOfWeek;
			do {
				int reduceDays = dayCounter == 0 ? 0 : 1;
				cal.add(Calendar.DAY_OF_MONTH, -reduceDays);
				dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
			} while (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY);
			lastSixBusinessDays[dayCounter] = cal.get(Calendar.DAY_OF_MONTH);
		}
		return lastSixBusinessDays;
	}

	@Test
	public void calendarDateFormatTest() {

		String pattern = "MM/dd/YYYY";

		Calendar cal = Calendar.getInstance();

		Date date = cal.getTime();

		SimpleDateFormat format1 = new SimpleDateFormat(pattern);

		String dateInExpectedPattern = format1.format(date);

		System.out.println("date1: " + dateInExpectedPattern);
	}

	@Test
	public void printDateIn() {

		String[] stringDates = getFutureDates();
		for (String date : stringDates) {
			System.out.println("stringDates: " + date);
		}
	}

	private String[] getFutureDates() {
		String pattern = "YYYY-MM-dd";
		String[] stringDates = new String[6];
		int TOTAL_DAYS = 6;

		Calendar cal = Calendar.getInstance();

		SimpleDateFormat format1 = new SimpleDateFormat(pattern);

		for (int index = 0; index < TOTAL_DAYS; index++) {

			cal.add(cal.DAY_OF_MONTH, 1);

			Date date = cal.getTime();

			String dateInExpectedPattern = format1.format(date);

			System.out.println("date1: " + dateInExpectedPattern);

			stringDates[index] = dateInExpectedPattern;
		}
		return stringDates;
	}

	@Test
	public void printDateInUS() {

		int[] stringDates = getLastSixBusinessDaysUS(6);
		for (int date : stringDates) {
			System.out.println("stringDates: " + date);
		}
	}

	public int[] getLastSixBusinessDaysUS(int totalPreviousDays) {
		List<String> holidays = new ArrayList<String>();
		holidays.add("6-20-2022");
		holidays.add("7-4-2022");
		int lastSixBusinessDays[] = new int[totalPreviousDays];
		Date date = new Date();
		String pattern = "YYYY-MM-dd";
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		// formatter.setTimeZone(TimeZone.getTimeZone("EST"));
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		for (int dayCounter = 0; dayCounter < totalPreviousDays; dayCounter++) {
			String checkDate = "";
			int dayOfWeek;

			do {
				int reduceDays = dayCounter == 0 ? 0 : 1;
				cal.add(Calendar.DAY_OF_MONTH, -reduceDays);
				dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
				checkDate = cal.get(Calendar.MONTH) + 1 + "-" + cal.get(Calendar.DAY_OF_MONTH) + "-"
						+ cal.get(Calendar.YEAR);
				System.out.println("cal: " + checkDate);
			} while (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY || holidays.contains(checkDate));
			lastSixBusinessDays[dayCounter] = cal.get(Calendar.DAY_OF_MONTH);
		}
		return lastSixBusinessDays;
	}

	@Test
	public static void printTimeZones() throws ParseException {

		// I am in IST time Zone (Its ID is Asia/Calcutta or ITS)
		System.out.println(TimeZone.getDefault());
		// I get Indian Time printed
		System.out.println(new Date());
		System.out.println("-------------------");
		// I am setting the time zone to China
		TimeZone.setDefault(TimeZone.getTimeZone("CTT"));
		// Now my default time zone is in China
		System.out.println(TimeZone.getDefault());
		// I get Chian Time printed
		System.out.println(new Date());
		System.out.println("-------------------");
		// I am setting the time zone to EST
		TimeZone.setDefault(TimeZone.getTimeZone("EST"));
		// Now my default time zone is in EST
		System.out.println(TimeZone.getDefault());
		// I get Eastern Time printed
		System.out.println(new Date());

	}
}
