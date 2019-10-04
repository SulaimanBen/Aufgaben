package Lotto.Aufgabe;

import java.util.Scanner;

public class LottoSpielSimulation {
	
	public static void main(String[] args) {
		
		  int anzahlKugel = 7;
		  int anzahlKugelGesamt = 49;
		  LottoSpiel lotto = new LottoSpiel(anzahlKugel, anzahlKugelGesamt);
		  
		  lotto.ziehen();
		  
		  System.out.println( lotto );
		  
		  System.out.println("----------------------------------------------------");
		  
		  LottoTipp tipp = new LottoTipp(anzahlKugel, anzahlKugelGesamt);
		  
		  tipp.abgeben();
		  System.out.println(tipp);
		  
		  System.out.println("----------------------------------------------------");
		  
		  int gewinn = lotto.vergleichen(tipp);
		  
		  System.out.println(gewinn);
		  
		  System.out.println(lotto.gewinnInfo());
		  System.out.println("----------------------------------------------------");
		  
		 
		 @SuppressWarnings("resource")
		Scanner setGesamtSpielZahl = new Scanner(System.in);
		 int zahl = setGesamtSpielZahl.nextInt();
		 int temprichtig=0;
		 int tempgewinn = 1;
		 
		 int gesamtgewinn=0;
		 
		 for (int gesamtSpielZahl = 0 ; gesamtSpielZahl < zahl ; gesamtSpielZahl++) {
			 lotto.richtige = temprichtig;
			 lotto.gewinnGeld= tempgewinn;
			 lotto.ziehen();
			 tipp.abgeben();
			 System.out.println(lotto);
			 System.out.println(tipp);
			 lotto.vergleichen(tipp);
			 System.out.println(lotto.gewinnInfo());
			 gesamtgewinn +=lotto.gewinnGeld;
			 
			 System.out.println("----------------------------------------------------");
		 }
		 
		 int Gesamt = gesamtgewinn - zahl;
		 System.out.println(Gesamt +" Euro gewonnen");
		 
		 System.out.println();
	}

}
