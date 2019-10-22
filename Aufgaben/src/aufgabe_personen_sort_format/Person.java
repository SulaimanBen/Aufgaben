package aufgabe_personen_sort_format;

public class Person implements Comparable<Person> {
	private String vorname , nachname;
	private int geburtsjahr;
	
	public Person(String vorname, String nachname, int geburtsjahr) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsjahr = geburtsjahr;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}


	public int getGeburtsjahr() {
		return geburtsjahr;
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
