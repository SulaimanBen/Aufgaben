package aufgabe_personen_sort_format;

import java.util.Arrays;
import java.util.Random;

public class PersonUtils {
	
	private static final String[] arrayMitSilben=
		{"pro","get","idre","su","ola","im","se","fo","ral","els","fal","man","th","mu"};
	
	public static void main(String[] args) {
		
		String neuerName = generiereName(arrayMitSilben, 4);
		System.out.println(neuerName);
		
		Person[] personen = new Person[10];

		System.out.println("********************Nicht Sortiert ******************");
		printPersonen(personen);
		
		System.out.println("********************aufsteigend Sortiert ******************");
		Arrays.sort(personen);
		printPersonen(personen);
	}// End of main

	 static void printPersonen(Person[] personen) {
		 Random randomGJ = new Random();
		 
		 String fmt = "|%5s| %15s| %15s| %15s|%n";
		 
		 String fmt2 = "|   %02d| %15s| %15s| %15s|%n";
		
		 // |  Nr. |   		Vorname |  		Nachname |  		Geburtsjahr |  
		 
		 System.out.printf( fmt ,"Nr.","Vorname","Nachname","Geburtsjahr");
		 System.out.println("----------------------------------------------------------");
		 
		 for(int i = 0 ; i < personen.length ; i++ ) {
			 personen[i]=new Person(generiereName(arrayMitSilben, randomGJ.nextInt(5-1)+1), 
					 				generiereName(arrayMitSilben, randomGJ.nextInt(5-1)+1),
					 				randomGJ.nextInt(2000-1950)+1950);
			 
			 System.out.printf(fmt2,i+1,personen[i].getVorname(),
					 					personen[i].getNachname(),
					 					personen[i].getGeburtsjahr());
		 }
		
	}

	static String generiereName(String[] arrayMitSilben, int num) {
		Random random = new Random();
		String siblen = "";
		for (int i = 0; i < num ; i++) {
			siblen += arrayMitSilben[random.nextInt(arrayMitSilben.length)];
			
		}
		String firstLetter = siblen.charAt(0) + "";
		return firstLetter.toUpperCase()+siblen.substring(1);
	}

	public static String[] createSilbenArray() {
		// TODO Auto-generated method stub
		return null;
	}
}
