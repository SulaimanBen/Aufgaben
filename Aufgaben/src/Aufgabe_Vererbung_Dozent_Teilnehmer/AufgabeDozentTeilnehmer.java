package Aufgabe_Vererbung_Dozent_Teilnehmer;

public class AufgabeDozentTeilnehmer {
	
	public static void main(String[] args) {
		
		JavaKurs Kurs = new JavaKurs(14525255);
		
		Teilnehmer t1 = new Teilnehmer("Sulaiman", "167");
		t1.setKurs(Kurs);
		System.out.println(t1);
		
		Dozent d1 =new Dozent("Ben", "2019");
		d1.setKurs(Kurs);
		
		DozentUndTeilnehmerDetail p =new DozentUndTeilnehmerDetail("", "");
		
		
		
		System.out.println(d1);
	}

}
