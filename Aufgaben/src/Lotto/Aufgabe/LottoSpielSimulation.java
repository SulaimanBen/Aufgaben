package Lotto.Aufgabe;

public class LottoSpielSimulation {
	
	public static void main(String[] args) {
		
		  int anzahlKugel = 7;
		  int anzahlKugelGesamt = 49;
		  LottoSpiel lotto = new LottoSpiel(anzahlKugel, anzahlKugelGesamt);
		  
		  lotto.ziehen();
		  
		  System.out.println( lotto );
		  
		  System.out.println("*************************************");
		  
		  LottoTipp tipp = new LottoTipp(anzahlKugel, anzahlKugelGesamt);
		  
		  tipp.abgeben();
		  System.out.println(tipp);
		  
		  System.out.println("**************************************");
		  
		  int gewinn = lotto.vergleichen(tipp);
		  
		  System.out.println(gewinn);
		  
		  System.out.println(lotto.gewinnInfo());
		  System.out.println("***************************************");
		  
		  System.out.println(lotto.Gesamtgewinn(10));
		 
	}

}
