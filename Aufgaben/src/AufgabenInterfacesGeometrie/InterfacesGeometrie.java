package AufgabenInterfacesGeometrie;

import java.util.Random;


abstract interface Figur{
	double getFlaeche();
} // End of Figur

class Rechteck implements Figur{
	private int breite , hoehe;
	
	public Rechteck(int breite , int hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}
	@Override
	public double getFlaeche() {
		return breite * hoehe;
	}// End od Rechteck
	
	public String toString() {
		return "Rechteck . "+ getFlaeche();
	}
	
} // End of Rechteck

class Kreis implements Figur{
	private int radius;
	
	public Kreis(int radius) {
		this.radius = radius;
	}

	@Override
	public double getFlaeche() {
		return Math.PI *radius *radius;
	}
	
	public String toString() {
		return "Kreise . " + getFlaeche();
	}
} // End of Kreis

public class InterfacesGeometrie {
	
	public static void main(String[] args) {
		
		Figur[] figur = new Figur[100];
		
		for ( int i = 0 ; i < figur.length ; i ++ ) {
			if(new Random().nextBoolean()) {
				figur[i] = new Rechteck(new Random().nextInt(10)+1 , new Random().nextInt(10)+1);
			}else
				figur[i] = new Kreis(new Random().nextInt(10)+1);
		}
		
		printFiguren(figur);
		
	} // End of main
	
	static void printFiguren(Figur[] figur) {
		int i = 1 ;
		for(Figur figuren : figur)
			System.out.println(i++ +". "+figuren.toString());
	}
}