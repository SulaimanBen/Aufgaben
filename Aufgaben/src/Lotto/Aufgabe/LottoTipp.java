package Lotto.Aufgabe;

import java.util.Arrays;

public class LottoTipp {

	private int anzahlKugel , anzahlKugelGesamt;

	public LottoTipp(int anzahlKugel, int anzahlKugelGesamt) {
		this.anzahlKugel = anzahlKugel;
		this.anzahlKugelGesamt = anzahlKugelGesamt;
		
	}

	public int[] abgeben() {
		
		LottoSpiel lottospiel = new LottoSpiel(anzahlKugel, anzahlKugelGesamt);
		
		return lottospiel.ziehen();
		
	}
	
	//Tipp 7 aus 49. [6, 9, 17, 23, 35, 41, 42]

	@Override
	public String toString() {
		int [] arr = abgeben();
		Arrays.sort(arr);
		return "Tipp " + anzahlKugel + " aus " + anzahlKugelGesamt+". "+ Arrays.toString(arr);
	}
	
	
	
	

}
