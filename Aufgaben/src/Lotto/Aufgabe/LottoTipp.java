package Lotto.Aufgabe;

import java.util.Arrays;
import java.util.Random;

public class LottoTipp {

	private int anzahlKugel , anzahlKugelGesamt;
	static int[] arr;
	

	public LottoTipp(int anzahlKugel, int anzahlKugelGesamt) {
		this.anzahlKugel = anzahlKugel;
		this.anzahlKugelGesamt = anzahlKugelGesamt;
		
	}

	public int[] abgeben() {
		
		arr= new int[this.anzahlKugel];
		Random random = new Random();
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i]= random.nextInt((this.anzahlKugelGesamt))+1;
		}
		return arr;
		
	}
	
	//Tipp 7 aus 49. [6, 9, 17, 23, 35, 41, 42]

	@Override
	public String toString() {
		int [] arr = this.arr;
		Arrays.sort(arr);
		return "Tipp " + anzahlKugel + " aus " + anzahlKugelGesamt+". "+ Arrays.toString(arr);
	}
	
	
	public static int[] getarr() {
		return arr;
	}
	
	
	

}
