package AufgabeArraysKampfarena;

import java.util.Arrays;

public class sitzBank {
	
	Kaempfer[] arrKaempfer = new Kaempfer[8];
	int index;

	public void add(Kaempfer kaempfer) {
		
		if( index == arrKaempfer.length) {
			arrKaempfer = Arrays.copyOf(arrKaempfer, arrKaempfer.length + 4);
		}
		
		arrKaempfer[index] = kaempfer;
		index++;
	}
	
	

}
