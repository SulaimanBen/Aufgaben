package Aufgabe_Vererbung_Dozent_Teilnehmer;

public class TestVererbung {
	
	public static void main(String[] args) {
		
		DozentUndTeilnehmerDetail t1 = new Teilnehmer("Sulaiman", "167");
		System.out.println(t1);
		
		t1 =new Dozent("Ben", "2019");
		System.out.println(t1);
	}

}
