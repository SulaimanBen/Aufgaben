package aufgabe_exceptions_parse_date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;


public class ParseDateExceptions {

	public static void main(String[] args) {
				
		DateFormat df = DateFormat.getDateInstance();
		
		while(true) {
			String dateAsString = getUserInput();
		try {
			Date date = df.parse(dateAsString);
			System.out.println(date);
			break;
		} catch (ParseException e) {
			System.out.println("Fehler : try again");
			}
		
		}
		System.out.println("main");
	}

	private static String getUserInput() {
		System.out.println("Bitte Datum eingeben (TT.MM.JJJJ)");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		return text;
	}
}
