package Klassen_Geometrie;

/*
 *  F�hren Sie den Begriff "Rechteck" in einem Projekt ein. Ein Rechteck hat Breite und H�he.
 */
public class Rechteck {

	int Breite, H�he;
	
	
	//Ein Rechteck soll es erm�glichen seine Ma�e auf der Konsole auszugeben.
	
	static void RechteckMasse(Rechteck rechteck) {
		System.out.println("Die Ma�e der Reckteck mit Brite :"+rechteck.Breite+" Und H�he : "+rechteck.H�he+ " ="+(rechteck.Breite*rechteck.H�he));
	}
	
	// Statische Methode
   static void setRechteckesDimensionenStatisch(Rechteck rechteck,int Breite,int H�he) {
		rechteck.Breite=Breite;
		rechteck.H�he=H�he;
		System.out.println("New RechteckesvDimensionen "+rechteck.Breite + "  "+rechteck.H�he);
	}
   // NICHT-statische Methode
   void setRechteckesDimensionen(int Breite,int H�he) {
	   this.Breite=Breite;
	   this.H�he= H�he;
	   System.out.println("New RechteckesvDimensionen " +this.Breite + "  "+this.H�he);
   }
   
   /*
    *  Erzeugen Sie 100 Rechtecke mit zuf�lligen Breiten und H�hen.
    *  Die Werte f�r die Breite und H�he m�ssen aber aus dem Bereich zwischen 1 und 20 gew�hlt werden.
    *  Geben Sie auf der Konsole die Informationen zu den erzeugten Objekten in etwa so aus:
    */
   
   void setZuf�lligenRechteckesDimensionen() {
	   for(int i=1;i <= 100; i++) {
		   this.Breite=(int)(Math.random()*(20-1)+1)+1;
		   this.H�he=(int)(Math.random()*(20-1)+1)+1;
		   System.out.println(i+". Rechteck "+"("+this.Breite+" * "+this.H�he+") ="+this.Breite*this.H�he);
	   }
   }
	
}
