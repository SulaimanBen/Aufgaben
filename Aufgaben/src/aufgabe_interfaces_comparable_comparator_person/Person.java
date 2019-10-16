package aufgabe_interfaces_comparable_comparator_person;

public class Person implements Comparable<Person> {

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
		if (erg == 0 ) {
			erg = geburtsjahr - p2.geburtsjahr;
		}
		return erg;
	}

	
	
}
