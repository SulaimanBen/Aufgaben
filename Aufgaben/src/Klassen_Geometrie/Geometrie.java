package Klassen_Geometrie;

public class Geometrie {

	public static void main(String[] args) {
		Rechteck rechteck=new Rechteck();
		rechteck.Breite=5;
		rechteck.Höhe=5;
	    RechteckMasse(rechteck);
	    rechteck.setZufälligenRechteckesDimensionen();
	    
	    Kreise k1=new Kreise(5);
	}
	
	static void RechteckMasse(Rechteck rechteck) {
		System.out.println("Die Maße der Reckteck mit Brite :"+rechteck.Breite+" Und Höhe : "+rechteck.Höhe+ " ="+(rechteck.Breite*rechteck.Höhe));
	}
}
