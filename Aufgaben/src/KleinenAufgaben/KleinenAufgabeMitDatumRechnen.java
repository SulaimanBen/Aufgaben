package KleinenAufgaben;

import java.time.LocalDate;


public class KleinenAufgabeMitDatumRechnen {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(1890,2, 12);
		System.out.println(date.isLeapYear());
		
		
		for (int year = 1890; year <= 2020 ; year+=2) {
			LocalDate date2 = LocalDate.of(year,2, 12);
			if (year % 4 == 0 && !date2.isLeapYear()) {
				System.out.println(year);
			}
		}
		
	}
}
