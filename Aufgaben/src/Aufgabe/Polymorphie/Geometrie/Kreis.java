package Aufgabe.Polymorphie.Geometrie;

public class Kreis extends Figuren {
	
	private int radius;

	public Kreis(int radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Kreis  Radius :"+ radius + ". Koordinaten : "+getDisplayKoordinaten();
	}

	public double getFlaeche() {
		return Math.PI *radius *radius;
	}
	
}
