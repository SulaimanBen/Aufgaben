package aufgabe_interfaces_comparable_comparator_person;

import java.util.Arrays;
import java.util.Comparator;

public class AufgabePerson {
	public static void main(String[] args) {
		
		// Vier Personen im Array speichern
		Person[] personen = {
				new Person( "Paul" , "Smith" , 1980),
				new Person( "Paul" , "Black" , 1975),
				new Person( "John" , "Smith" , 1995),
				new Person( "John" , "Black" , 2000)
		};
		
		// Array ausgeben
		print(personen);
		System.out.println("****Aufsteigend sortieren*****");
		// Array sortieren und dann ausgeben
		Arrays.sort(personen);
		print(personen);
		int erg = Arrays.binarySearch(personen,new Person( "John" , "Black" , 2000));
		System.out.println("John Black ist in index : "+erg);
		
		System.out.println("****Absteigend sortieren*****");
		
		Comparator<Person> comp = Comparator.reverseOrder();
		Arrays.sort(personen,comp);
		print(personen);
		
		erg = Arrays.binarySearch(personen,new Person( "John" , "Smith" , 1995) , comp);
		System.out.println("John Smith ist in index : "+erg);
		
	}
	
	static void print(Person[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+1 + ". "+array[i]);
		}
	}
}