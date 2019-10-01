package AufgabeIntMatrix;

import java.util.Random;

public class IntMatrix {
	private int rows,columns,val;
	int[][] matrix;
	
	public IntMatrix(int rows, int columns) {
		this.rows=rows;
		this.columns=columns;
		matrix=new int[this.rows][this.columns];
		
		for(int i = 0 ; i < matrix.length ; i++ ) {
			for(int j = 0 ; j < matrix[i].length ; j++) {
				matrix[i][j]=val;
			}
		}
	}
	
	public IntMatrix(int rows, int columns, int val) {
		this.rows=rows;
		this.columns=columns;
		this.val=val;
		matrix=new int[this.rows][this.columns];
		for(int i = 0 ; i < matrix.length ; i++ ) {
			for(int j = 0 ; j < matrix[i].length ; j++) {
				matrix[i][j]=val;
			}
		}
	}
	

	int get(int r , int c) {
		int i=matrix[r][c];
		return i;
	}
	
	static void getRandomMatrix(int rows, int columns, int max){
		IntMatrix m=new IntMatrix(rows, columns);
		m.matrix= new int[rows][columns];
		Random r = new Random();
		
		for(int i =0 ; i < m.matrix.length ; i++) {
			for(int j = 0 ; j < m.matrix[i].length ; j++) {
				m.matrix[i][j]=r.nextInt(200);
				System.out.print(m.matrix[i][j]+"  ");
			}
			System.out.println();
		}
	}
	public boolean equals(Object m1) {
		IntMatrix m2 = (IntMatrix)m1;
		return rows == m2.rows && columns == m2.columns;
	}

}
