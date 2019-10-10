package KleinenAufgaben;

public class AufgabePolymorphie {
	
	public static void main(String[] args) {
		
		/*
		 *  A1. 
		 */
		IntOperation op1 = new AddOne();// Eine Einz addieren
		IntOperation op2 = new Negate();// Vorzeichen umkehren
		
		int x = 5;
		x = op1.excute(x);
		System.out.println("x = "+x);// 6
		
		x = op2.excute(x);
		System.out.println("x = "+x);//6
		
		/*
		 *  A2 
		 *  Erzeugen Sie ein Array mit mindestens 4 unterschiedlichen IntOp.
		 *  
		 */
	}
}


abstract class IntOperation{
	
	abstract int excute(int x);
	
}
class AddOne extends IntOperation{

	@Override
	int excute(int x) {
		return x+1;
	}
	
}
class Negate extends IntOperation{

	@Override
	int excute(int x) {
		return -x;
	}
	
}
