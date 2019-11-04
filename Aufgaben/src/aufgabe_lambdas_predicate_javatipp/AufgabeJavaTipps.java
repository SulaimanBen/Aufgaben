package aufgabe_lambdas_predicate_javatipp;

import java.util.function.Predicate;

public class AufgabeJavaTipps {
	
	public static void main(String[] args) {
		
		JavaTipp t1 = new JavaTipp("Mit dem Schlüsselwort 'implements' kann eine Klasse ein Interface realisieren.");
		t1.addThema("Vererbung");
		t1.addThema("Klassen");
		t1.addThema("Interfaces");
		
		JavaTipp t2 = new JavaTipp("Eine Klasse kann nur eine andere Klasse erweitern.");
		t2.addThemen("Vererbung","Klassen");
		
		JavaTipp t3 = new JavaTipp("Statische Methoden werden mit dem Klassennamen aufgerufen.");
		t3.addThemen("Klassen", "Methoden", "static");
		
		JavaTipp t4 = new JavaTipp("Alle Attribute in einem neuen Objekt werden im Konstruktor initialisiert.");
		t4.addThemen("Klassen", "Konstruktoren", "Attribute");
		
		JavaTipp t5 = new JavaTipp("Beim Überschreiben darf die Sichtbarkeit nicht verschärft werden.");
		t5.addThemen("Klassen", "Methoden", "Überschreiben");
		
		JavaTipp t6 = new JavaTipp("Alle Elemente in einem Interface sind immer 'public'");
		t6.addThemen("Interfaces", "Sichtbarkeiten");
		
		JavaTipp[] tipps = {t1 , t2 , t3 , t4 , t5 , t6 };
		
		printIf(tipps , param -> true);
		
		System.out.println("********* A4 ***********");
		printIf(tipps , tipp -> tipp.getText().contains("Klasse"));
		
		System.out.println("********* A5 ***********");
		printIf(tipps, tipp -> tipp.getThemen().size() == 2);
		
		System.out.println("********* A6 ***********");
		Predicate<JavaTipp> predicateContainsKlassen = tipp -> tipp.getThemen().contains("Klassen");
		printIf(tipps, predicateContainsKlassen);
		
		System.out.println("********* A7 ***********");
		Predicate<JavaTipp> predicateContainsKlassenButVererbung = predicateContainsKlassen.
											and( tipp -> !tipp.getThemen().contains("Vererbung") );
		printIf(tipps,predicateContainsKlassenButVererbung);
		
		
	}
	
	static void printIf(JavaTipp[] tipps , Predicate<JavaTipp> filter) {
		
		for (JavaTipp tipp : tipps) {
			if ( filter.test(tipp)) {
				System.out.println("Java-Tipp : "+tipp.getText());
				System.out.println("Themen: "+ tipp.getThemen());
			}
		}
	}
}
