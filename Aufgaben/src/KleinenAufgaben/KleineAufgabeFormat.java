package KleinenAufgaben;

import java.util.Random;

public class KleineAufgabeFormat {
	
	public static void main(String[] args) {
		
		/*
		 * A1
		 * 
		 * 
		 * Bitte das Array mit Zufallswerten als eine Tabelle ausgeben:
		 * 
		 * |     Nr.| 		Wert  |
		 * |	 01 | 	   121314 |
		 * |     02 | 		  -22 |
		 * ...
		 * 
		 */
		int[] array = randomArray(); // Array Länge 10 mit Zufallswerten aus dem Bereich [-10000 ... 10000] 
		print(array);
		
	}

	private static void print(int[] array) {
		
		String fmt = "|%8s|%10s|%n";
		
		String fmt2 =  "|      %02d|%10s|%n";
		
		System.out.printf(fmt,"Nr.","Wert");
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf(fmt2 , i+1 , array[i]);
		}
		
	}

	private static int[] randomArray() {
		int[] arr = new int[10];
		
		Random random = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(20001)-10000;
			
		}
		return arr;
	}
}
