package Klassen_Geometrie;

public class Geometrie {

	public static void main(String[] args) {
		
		Rechteck rechteck=new Rechteck();
		rechteck.Breite=5;
		rechteck.Höhe=5;
	    rechteck.RechteckMasse(rechteck);
	    rechteck.setZufälligenRechteckesDimensionen();
	    
	    Kreise k1=new Kreise(5);
	}
	
	
}
