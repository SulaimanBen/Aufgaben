package Aufgabe.Polymorphie.Geometrie;

public abstract class Figuren {
	
	private int x ,y ;
	
	public Figuren() {
		// TODO Auto-generated constructor stub
	}
	
	public Figuren(int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	String getDisplayKoordinaten() {
		return "[" + x + ", "+ y + "]";
	}
	void bewegen(int x , int y) {
		this.x = x;
		this.y = y;
	}

	/*public double getFlaeche() {
		return -1;
	}*/

	public abstract double getFlaeche();
}
