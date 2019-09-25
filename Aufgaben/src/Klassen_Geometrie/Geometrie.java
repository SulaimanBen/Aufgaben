package Klassen_Geometrie;

public class Geometrie {

	public static void main(String[] args) {
		Rechteck rechteck=new Rechteck();
		rechteck.Breite=5;
		rechteck.Höhe=5;
	    rechteck.RechteckMasse(rechteck);
	    rechteck.setZufälligenRechteckesDimensionen();
	    
	    new Kreise(5);
	  //  System.out.println(1+1+rechteck); compiler fehler ----> undefined operator
	    rechteck.changeRechteckesDimensionenStatisch(rechteck, 5, 2);
	    rechteck.setRechteckesDimensionen(8, 2);
	    rechteck.RechteckMasse(rechteck);
	}
	
	
}
