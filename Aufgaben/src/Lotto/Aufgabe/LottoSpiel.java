package Lotto.Aufgabe;

import java.util.Arrays;
import java.util.Random;

public class LottoSpiel {
	
	 private int anzahlKugel , anzahlKugelGesamt;
	

	public LottoSpiel(int anzahlKugel, int anzahlKugelGesamt) {
		this.anzahlKugel=anzahlKugel;
		this.anzahlKugelGesamt=anzahlKugelGesamt;
	}
	
	//Spiel 7 aus 49. [3, 7, 11, 28, 35, 40, 48]
	@Override
	public String toString() {
		int[] arr= ziehen();
		Arrays.sort(arr);
		
		return "Spiel "+this.anzahlKugel+" aus " +this.anzahlKugelGesamt+"."+Arrays.toString(arr) ;
	}



	public int[] ziehen() {
		int[] arr= new int[this.anzahlKugel];
		Random random = new Random();
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i]= random.nextInt((this.anzahlKugelGesamt))+1;
		}
		return arr;
		
	}

}
