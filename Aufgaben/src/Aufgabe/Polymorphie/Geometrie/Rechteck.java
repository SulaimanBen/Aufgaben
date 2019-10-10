package Aufgabe.Polymorphie.Geometrie;

public class Rechteck extends Figuren {
	
	private int breite , hoehe;

	public Rechteck(int breite, int hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	@Override
	public String toString() {
		return "Rechteck "+ breite + " X "+hoehe+". Koordinaten : "+getDisplayKoordinaten();
	}

	public double getFlaeche() {
		return breite * hoehe;
	}
}
