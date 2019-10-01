package AufgabeIntMatrix;

import java.util.Random;

public class MatrixAufgabe {
	
	public static void main(String[] args) {
		
		/*
		 *  m1
		 */
		 
		IntMatrix m1 = new IntMatrix(2, 3);
		
		System.out.println("****Matrix m1");
		
		System.out.println(m1);
		
		System.out.println("m1. Zeilen: "+ m1.getCountRows()); // String x = "m1. Zeilen: "+ m1.getCountRows();
		System.out.println("m1. Spalten: "+ m1.getCountColumns());
		
		/*
		 *  m2
		 */
		
		IntMatrix m2 = new IntMatrix(5, 3, 100);
		
		System.out.println("****Matrix m2");
		System.out.println(m2);
		
		System.out.println("m1.get(1, 2) :" + m2.get(1, 2) );

		m2.set(1,2,-17);
		System.out.println("m2.get(1, 2) :" + m2.get(1, 2) );
		
		
		IntMatrix m3 = IntMatrix.getRandomMatrix(4, 6, 200);
		
		System.out.println();
		System.out.println("****Matrix m3");
		System.out.println(m3);
		
		/*
		 *  test equal
		 */
		
		IntMatrix m4 = new IntMatrix(2, 3);
		System.out.println(m1.equals(m4));
		
		/*
		 *  Array mit Matrizen
		 */
		
		IntMatrix[] array = new IntMatrix[5];
		
		Random random = new Random();
		
		for( int i = 0 ; i < array.length ; i++) {
			int rows = random.nextInt(9)+2;
			int cols = random.nextInt(9)+2;
			array[i]=new IntMatrix(rows, cols);
		}
		
		for(IntMatrix m : array) {
			System.out.println("**** Matrix");
			System.out.println(m);
		}
	}

}
