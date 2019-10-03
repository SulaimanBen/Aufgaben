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
		
	}

}
