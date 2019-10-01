package AufgabeIntMatrix;

import java.util.Random;

public class IntMatrix {
	
	public static IntMatrix getRandomMatrix(int rows, int columns, int max){
		
		IntMatrix m=new IntMatrix(rows, columns);
		Random r = new Random();
		
		for(int i =0 ; i < m.getCountRows() ; i++) {
			for(int j = 0 ; j < m.getCountColumns() ; j++) {
				m.matrix[i][j]=r.nextInt(max);
				
			}
		}
		return m;
	}
	
	
	private int[][] matrix;
	
	public IntMatrix(int rows, int columns) {
		// Todo: Argumente überprüfen
		matrix=new int[rows][columns];
	}
	
	public IntMatrix(int rows, int columns, int val) {
		this(rows,columns);
		
		for(int row = 0 ; row < getCountRows() ; row++) {
			for(int col = 0 ; col < getCountColumns() ; col++) {
				matrix[row][col] = val;
			}
		}
	}
	
	public int getCountRows() {
		return matrix.length;
	}
	
	public int getCountColumns() {
		return matrix[0].length;
	}
	
	@Override
	public String toString() {
		// todo: StringBuilder einsetzer
		String text = "";
		
	//	text = text + matrix[0][0];
	//	text = text + ", ";
		
		for(int row = 0 ; row < getCountRows() ; row++) {
			for(int col=0 ; col < getCountColumns() ; col++) {
				text = text + matrix[row][col];
				if(col < getCountColumns()-1) {
					text = text + ", ";
				}
			}
			text = text + '\n';
		}
		
		return text;
	}
	
	int get(int r , int c) {
		return matrix[r][c];
	}
	
	public void set(int row , int col , int val) {
		matrix[row][col]=val;
	}
	
	
	public boolean equals(Object obj) { // Überschreiben der Methode aus der Klasse Objekt.
									   // Überladen der Methode mit der signatur equals(IntMatrix)
		
		if( obj instanceof IntMatrix) {
			return false;
		}
		IntMatrix m2 = (IntMatrix)obj;
		return equals(m2);
	}
	public boolean equals(IntMatrix m2) { // Überladen der Methode mit der signatur equals(Objekt)
		
		if(m2 == null) {
			return false;
		}
		
		if( getCountRows() != m2.getCountRows() || getCountColumns() != m2.getCountColumns()) {
			return false;
		}
		for (int row = 0; row < getCountRows(); row++) {
			for (int col = 0; col < getCountColumns(); col++) {
				if( get(row, col) != m2.get(row, col) ) {
					return false;
				}
			}
		}

		return true;
	}

}
