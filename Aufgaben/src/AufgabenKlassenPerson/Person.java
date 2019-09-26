package AufgabenKlassenPerson;

/*
 * Erstellen Sie eine neue Klasse Person mit folgenden Attributen:
 *  Vorname, Nachname, Geburtsjahr, Postleitzahl.
 *  Verwenden Sie für diese Attribute sinnvolle Datentypen und Namen.
 */
public class Person {
	
	private String vorname, nachname;
	private int geburtsjahr, postleitzahl;
	
	// Erstellen Sie mindestens zwei Konstruktoren für die Klasse Person.
	
	Person(String vorname,String nachname) {
			this.vorname=vorname;
			this.nachname=nachname;
	}
	Person(String vorname,String nachname,int geburtsjahr,int postleitzahl) {
		this.vorname=vorname;
		this.nachname=nachname;
		this.geburtsjahr=geburtsjahr;
		this.postleitzahl=postleitzahl;
	}
	
	// Überschreiben Sie die Methode toString() sinnvoll.
	
	public String toString() {
		return "Vorname : "+this.vorname+"\nNachname : "+this.nachname+"\nGeburtsjahr : "+this.geburtsjahr
				+"\nPostleitzahl : "+this.postleitzahl;
	}
	
	// Definieren Sie alle Getter- und Setter-Methoden nach JavaBeans Standard
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public int getGeburtsjahr() {
		return geburtsjahr;
	}
	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}
	public int getPostleitzahl() {
		return postleitzahl;
	}
	public void setPostleitzahl(int postleitzahl) {
		this.postleitzahl = postleitzahl;
	}
	
	// Überschreiben Sie die Methode equals und testen Sie sie mit den erstellten Personen.
	
	public boolean equals(Object obj) {
		Person p1 = (Person)obj;
		return p1.vorname.equals(p1.vorname) && p1.nachname.equals(p1.nachname)
				&& p1.geburtsjahr == geburtsjahr && p1.postleitzahl == postleitzahl;
	}
		

}
