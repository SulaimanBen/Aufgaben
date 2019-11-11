package aufgabe_exceptions_parse_date;

import java.util.Scanner;

public class ParseDateException {
	
	public static void main(String[] args) {
		
		String dateAsString = getUserInput();
		
	}

	private static String getUserInput() {
		Scanner input = new Scanner(System.in);
		String text = input.next();
		return text;
	}
}
