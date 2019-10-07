package Lotto.Aufgabe;

import java.util.Arrays;
import java.util.Random;

public class LottoTipp {

	private int anzahlKugel , anzahlKugelGesamt;
	private int[] zahlenArr;
	

	public LottoTipp(int anzahlKugel, int anzahlKugelGesamt) {
		this.anzahlKugel = anzahlKugel;
		this.anzahlKugelGesamt = anzahlKugelGesamt;
		
	}

	public int[] abgeben() {
		
		zahlenArr= new int[this.anzahlKugel];
		Random random = new Random();
		for(int i = 0 ; i < zahlenArr.length ; i++) {
			zahlenArr[i]= random.nextInt((this.anzahlKugelGesamt)-1)+1;
		}
		return zahlenArr;
		
	}
	
	//Tipp 7 aus 49. [6, 9, 17, 23, 35, 41, 42]

	@Override
	public String toString() {
		int [] arr = this.zahlenArr;
		Arrays.sort(arr);
		return "Tipp " + anzahlKugel + " aus " + anzahlKugelGesamt+". "+ Arrays.toString(arr);
	}

	public int[] getArr() {
		return zahlenArr;
	}
	

}
