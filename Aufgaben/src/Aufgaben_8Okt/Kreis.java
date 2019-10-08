package Aufgaben_8Okt;

public class Kreis extends Koordinaten{
	private int Radius;

	public Kreis(int radius) {
		Radius = radius;
	}
	@Override
	public String toString() {
		return "Kreis Radius = "+Radius+super.toString();
	}
	
}
