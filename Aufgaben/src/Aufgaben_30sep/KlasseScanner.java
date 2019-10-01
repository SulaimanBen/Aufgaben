package Aufgaben_30sep;

import java.util.Scanner;

public class KlasseScanner {
	public static void main(String[] args) {
		ausEinemStringLesen();
		ausEinemStringLesenMitEinerSchleife();
		vonDerKonsolelesen();
		
	}
	
	public static void vonDerKonsolelesen() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name:  ");
		String input = sc.next();
		System.out.print("Enter jahsd:  ");
		String sdfs = sc.next();
		
		
	}
	
	public static void ausEinemStringLesenMitEinerSchleife() {
		
		Scanner sc= new Scanner("mo di mi do fr");
		
		while(sc.hasNext()) {
			String element = sc.next();
			System.out.println(element);
		}
		sc.close();
		
	}
	
	public static void ausEinemStringLesen() {
		
		String stringSource = "a b hallo d";
		
		Scanner sc = new Scanner(stringSource);
		
		String element= sc.next();
		
		System.out.println(element);
		
		if(sc.hasNext()) {
			element = sc.next();
			System.out.println(element);
		}else {
			System.out.println("Keine Elemente");
		}
		sc.close();
	}

}
