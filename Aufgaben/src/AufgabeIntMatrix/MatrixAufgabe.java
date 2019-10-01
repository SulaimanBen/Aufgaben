package AufgabeIntMatrix;

public class MatrixAufgabe {
	
	public static void main(String[] args) {
		 
		IntMatrix m1 = new IntMatrix(2, 3);
		
		IntMatrix m2 = new IntMatrix(5, 3, 100);
		
		System.out.println(m1);
		
		int i = m1.get(1, 2);
		System.out.println(i);
		
		IntMatrix.getRandomMatrix(4, 6, 200);
		
		boolean r=m1.equals(m2);
		System.out.println(r);
	}

}
