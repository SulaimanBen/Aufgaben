package aufgabe_date_time_calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeCalendar {

	public static void main(String[] args) {
		
		printCalendar(4, 2010); // April 2010
		
	}

	private static void printCalendar(int month, int year) {
		System.out.println("-------------------------");
		LocalDate date = LocalDate.of(year, month, 1);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MMMM y");
		String dateFormat = date.format(fmt);
		System.out.println(dateFormat);
		
		System.out.println("-------------------------");
		System.out.println(date.lengthOfMonth());
		fmt = DateTimeFormatter.ofPattern("EEEE");
		
		String textFormat = "| %02d |  %-10s  |\n";
		for (int tag = date.getDayOfMonth(); tag < date.lengthOfMonth() ; tag++ ) {
			System.out.printf(textFormat,tag ,date.format(fmt));
			date = date.plusDays(1);
		}
	}
}
