package KleinenAufgaben;

import java.util.Random;

public class KleineAufgabeParseInt_TryCatch {
	
	static boolean isInteger(String st) {
		try {
			@SuppressWarnings("unused")
			int num = Integer.parseInt(st);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	static void maybeException() {
		
		if(new Random().nextBoolean())
			throw new RuntimeException();
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(isInteger("Hallo welt"));
		System.out.println(isInteger("10"));
		
		do {
			try {
				System.out.println("Rufen die methode auf");
				maybeException();
				System.out.println("Erfolg");
				break;
			} catch (Exception e) {
				System.out.println("Exception");
					
			}
		
		}while( true );
		
		System.out.println("End of main");
	}

}
