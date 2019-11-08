package aufgabe_taschenrechner;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Tschenrechner {
	
	public static void main(String[] args) {
		
		
		
		while (true) {
			
		try {
			computeInterActive();
		} catch (InputMismatchException e) {
			System.out.println("Keine Zahl ! ");
			continue;
		} catch (IllegalArgumentException e) {
			System.out.println("Keine Operator ! ");
			continue;
		}
		
		char userInput = readChar();
		
		if (userInput == 'q' || userInput == 'Q') {
			break;
		}
	 }
	}
	
	private static void computeInterActive() throws IllegalArgumentException , InputMismatchException {
		System.out.println("Zahl1 : ");
		double zahl1 = readDouble();
		
		System.out.println("Operator : ");
		char operator = readChar();
		
		System.out.println("Zahl2 : ");
		double zahl2 = readDouble();
		
		double result ;
		
		switch (operator) {
		
			case '+':
				result = zahl1 + zahl2;
				break;
			case '-':
				result = zahl1 - zahl2;
				break;
			case '*':
				result = zahl1 * zahl2;
				break;
			case '/':
				result = zahl1 / zahl2;
				break;
			case '%':
				result = zahl1 % zahl2;
				break;

			default:
				throw new IllegalArgumentException("Operator not supported: " + operator);
		}
		
		System.out.println( zahl1 + " " + operator + " " + zahl2 + " = " + result);
		
		System.out.println("Nochmal");
	}

	@SuppressWarnings("resource")
	private static char readChar() {
		return new Scanner(System.in).nextLine().charAt(0);
	}

	@SuppressWarnings("resource")
	private static double readDouble() {
		return new Scanner(System.in).nextDouble();
	}

}
