package Aufgabe_Vererbung_Dozent_Teilnehmer;

public class DozentUndTeilnehmerDetail {
	
	String Name , ID;
	JavaKurs Kurs;

	public DozentUndTeilnehmerDetail(String name, String iD) {
		Name = name;
		ID = iD;
	}
	
	void setKurs(JavaKurs Kurs) {
		this.Kurs = Kurs;
	}
	
	
	public String getName() {
		return Name;
	}

	public String getID() {
		return ID;
	}

	public JavaKurs getKurs() {
		return Kurs;
	}

	@Override
	public String toString() {
		return "Name :"+Name+ " ID : "+ID  ;
	}
	
	
}
