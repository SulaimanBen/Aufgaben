package Aufgabe_Vererbung_Dozent_Teilnehmer;

public class DozentUndTeilnehmerDetail {
	
	String Name , ID;

	public DozentUndTeilnehmerDetail(String name, String iD) {
		Name = name;
		ID = iD;
	}
	
	@Override
	public String toString() {
		return "Name :"+Name+ " ID : "+ID  ;
	}
	
	
}
