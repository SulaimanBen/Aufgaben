package AufgabenKlassenPerson;

public class KlassenPerson {
	
	public static void main(String[] args) {
		
		// Erzeugen Sie 2 Beispielinstanzen der Klasse Person mit unterschiedlichen Konstruktoren.
		
		Person p1=new Person("Ben", "Sulaiman");
		Person p2=new Person("Ben","Sulaiman",1992,80689);
		
		// Geben Sie die erstellten Personen auf der Konsole aus.
		System.out.println(p1);
		System.out.println("***********************************");
		System.out.println(p2);
		System.out.println("***********************************");
		
		// equals Methode testen
		System.out.println(p1.equals(p2)); // false
		Person p3=new Person("Ben","sulaiman",1992,80689);
		System.out.println(p2.equals(p3));
		
		// Statische Methode ´getMustermann´ testen
		
		System.out.println(getMustermann());
		
	}
	
	/*
	 *  Erzeugen Sie bitte eine statische Methode getMustermann die eine neue Person 'Max Mustermann,
	 *  Geburtsjahr: 1960, Plz: 12345' bildet und zurück liefert. 
	 *  Testen Sie die Methode.
	 */
	
	/*static String getMustermann() {
		Person p=new Person(p.setVorname("Max"), p.setNachname("Mustermann"),p.setGeburtsjahr(1960),p.setPostleitzahl(12345));
		p.setVorname("Max");
		p.setNachname("Mustermann");
		p.setGeburtsjahr(1960);
		p.setPostleitzahl(12345);
		return p.getVorname()+" "+ p.getNachname()+" , Geburtsjahr : "+p.getGeburtsjahr()
		+" , Plz : "+p.getPostleitzahl();
	}*/

}
