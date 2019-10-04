package Lotto.Aufgabe;

import java.util.Arrays;
import java.util.Random;

public class LottoSpiel {
	
	private int anzahlKugel , anzahlKugelGesamt;
	private int[] arr;
	int richtige = 0 , gewinnGeld=1;
	

	public LottoSpiel(int anzahlKugel, int anzahlKugelGesamt) {
		this.anzahlKugel=anzahlKugel;
		this.anzahlKugelGesamt=anzahlKugelGesamt;
	}
	
	//Spiel 7 aus 49. [3, 7, 11, 28, 35, 40, 48]
	@Override
	public String toString() {
		int[] arr= this.arr;
		Arrays.sort(arr);
		
		return "Spiel "+this.anzahlKugel+" aus " +this.anzahlKugelGesamt+"."+Arrays.toString(arr) ;
	}



	public int[] ziehen() {
		arr= new int[this.anzahlKugel];
		Random random = new Random();
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i]= random.nextInt((this.anzahlKugelGesamt))+1;
		}
		return arr;
		
	}

	public int vergleichen(LottoTipp tipp) {
		int[] arrtipp = tipp.getArr();
		
		for( int i = 0 ; i < anzahlKugel ; i ++ ) {
			if( arr[i] == arrtipp[i]) {
				richtige++;
			}
		}
		
		
		return richtige;
	}
	
	public String gewinnInfo() {
		int temprichtige = richtige;
		
		if( temprichtige == 0) {
			gewinnGeld=0;
		}
		else if(temprichtige == 1) {
			gewinnGeld=1;
		}
		else {
			while ( temprichtige > 1 ) {
				gewinnGeld *= 10;
				temprichtige--;
			}
		}
		
		return this.richtige + " richtige : " + gewinnGeld + " Euro" ;
	}

	public int[] getArr() {
		return arr;
	}
}
