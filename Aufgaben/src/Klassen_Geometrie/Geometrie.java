package Klassen_Geometrie;

public class Geometrie {

	public static void main(String[] args) {
		Rechteck rechteck=new Rechteck();
		rechteck.Breite=5;
		rechteck.H�he=5;
	    RechteckMasse(rechteck);
	    rechteck.setZuf�lligenRechteckesDimensionen();
	    
	    Kreise k1=new Kreise(5);
	}
	
	static void RechteckMasse(Rechteck rechteck) {
		System.out.println("Die Ma�e der Reckteck mit Brite :"+rechteck.Breite+" Und H�he : "+rechteck.H�he+ " ="+(rechteck.Breite*rechteck.H�he));
	}
}
