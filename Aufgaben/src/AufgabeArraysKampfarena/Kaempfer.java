package AufgabeArraysKampfarena;

import java.util.Random;

public class Kaempfer {
	
	String Kname;
	int[][] Kaempferarray1;
	
	String[][] Kaempferarray2;
	

	void setkaempferarray(int rows, int columns) {
		Kaempferarray1 = new int [rows][columns];
		Random koSchlag = new Random();
		
		for(int row = 0 ; row < rows ; row++) {
			for(int col = 0 ; col < columns ; col++) {
				if(col == 1) {
					Kaempferarray1[row][col]=koSchlag.nextInt((10-5)+1)+5;
					System.out.print(Kaempferarray1[row][col]);
				}else {
				Kaempferarray1[row][col]=row+1;
				System.out.print(Kaempferarray1[row][col]);
				}
			}
			System.out.println();
		}
	}
	
}
