package Aufgaben_8Okt;

public class Rechteck extends Figuren{
	
	private int Breite, Hoehe;

	public Rechteck(int breite, int hoehe) {
		Breite = breite;
		Hoehe = hoehe;
	}
	
	@Override
	public String toString() {
		return "Rechteck Breite = "+Breite+" Hoehe = "+Hoehe+super.toString();
	}
	
}
