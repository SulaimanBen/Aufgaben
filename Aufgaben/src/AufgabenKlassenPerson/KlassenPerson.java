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
	}

}
