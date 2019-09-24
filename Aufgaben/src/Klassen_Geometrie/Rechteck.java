package Klassen_Geometrie;

/*
 *  Führen Sie den Begriff "Rechteck" in einem Projekt ein. Ein Rechteck hat Breite und Höhe.
 */
public class Rechteck {

	int Breite, Höhe;
	
	
	//Ein Rechteck soll es ermöglichen seine Maße auf der Konsole auszugeben.
	
	static void RechteckMasse(Rechteck rechteck) {
		System.out.println("Die Maße der Reckteck mit Brite :"+rechteck.Breite+" Und Höhe : "+rechteck.Höhe+ " ="+(rechteck.Breite*rechteck.Höhe));
	}
	
	// Statische Methode
   static void setRechteckesDimensionenStatisch(Rechteck rechteck,int Breite,int Höhe) {
		rechteck.Breite=Breite;
		rechteck.Höhe=Höhe;
		System.out.println("New RechteckesvDimensionen "+rechteck.Breite + "  "+rechteck.Höhe);
	}
   // NICHT-statische Methode
   void setRechteckesDimensionen(int Breite,int Höhe) {
	   this.Breite=Breite;
	   this.Höhe= Höhe;
	   System.out.println("New RechteckesvDimensionen " +this.Breite + "  "+this.Höhe);
   }
   
   /*
    *  Erzeugen Sie 100 Rechtecke mit zufälligen Breiten und Höhen.
    *  Die Werte für die Breite und Höhe müssen aber aus dem Bereich zwischen 1 und 20 gewählt werden.
    *  Geben Sie auf der Konsole die Informationen zu den erzeugten Objekten in etwa so aus:
    */
   
   void setZufälligenRechteckesDimensionen() {
	   for(int i=1;i <= 100; i++) {
		   this.Breite=(int)(Math.random()*(20-1)+1)+1;
		   this.Höhe=(int)(Math.random()*(20-1)+1)+1;
		   System.out.println(i+". Rechteck "+"("+this.Breite+" * "+this.Höhe+") ="+this.Breite*this.Höhe);
	   }
   }
	
}
