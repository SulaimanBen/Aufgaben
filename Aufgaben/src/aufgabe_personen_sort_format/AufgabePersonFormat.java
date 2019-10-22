package aufgabe_personen_sort_format;

import java.util.Comparator;
import java.util.Random;

public class AufgabePersonFormat {
	
	public static void main(String[] args) {
		
		Person[] personen = new Person[10];
		
		Random random = new Random();
		
		String[] silben = PersonUtils.createSilbenArray();
		
		Comparator<Person> cmp = Comparator.reverseOrder();
		
	}
}
