package Aufgabe_Interfaces_Comparable_Comparator_Person;

import java.util.Comparator;

public class Person implements Comparable<Person> , Comparator<Person>{

	private String vorname , nachname;
	private int geburtsjahr;
	
	

	public Person() {
		super();
	}

	public Person(String voename, String nachname , int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
		this.vorname = voename;
		this.nachname = nachname;
	}
	
	@Override
	public String toString() {
		return vorname + " " + nachname + " " + geburtsjahr;
	}

	@Override
	public int compareTo(Person p2) {
		int erg = nachname.compareTo(p2.nachname);
		if( erg == 0) {
			erg = vorname.compareTo(p2.vorname);
		}
		else if (erg == 0 ) {
			erg = geburtsjahr - p2.geburtsjahr;
		}
		return erg;
	}

	@Override
	public int compare(Person p1, Person p2) {
		return p2.compareTo(p1);
	}
	
	
}
