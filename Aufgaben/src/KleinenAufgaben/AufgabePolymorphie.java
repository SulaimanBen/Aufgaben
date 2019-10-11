package KleinenAufgaben;

public class AufgabePolymorphie {
	
	public static void main(String[] args) {
		
		/*
		 *  A1. 
		 */
		IntOperation op1 = new AddOne();// Eine Einz addieren
		IntOperation op2 = new ChangeSign();// Vorzeichen umkehren
		
		int x = -5 ;
		x = op1.excute(x);
		System.out.println("x = "+x);// 6
		
		x = op2.excute(x);
		System.out.println("x = "+x);//6
		
		/*
		 *  A2 . 
		 */
		
		x = 2;
		IntOperation[] array = {
				new AddOne(),
				new ChangeSign(),
				new Multiply(4),
				new Subtract(7)
		};
		
		for (IntOperation op : array) {
			x = op.excute(x);
			System.out.println(x);
		}
		System.out.println("x = "+x);
		
		
		System.out.println("*****************************");
		
		
		IntOperation op = new AddOne()
				.andThen( new ChangeSign() )
				.andThen( new Multiply(4) )
				.andThen( new Subtract(7) );
		x=2;
		int result = op.excute(x);
		System.out.println( "result = " + result );
		
	} // End of main
}


abstract class IntOperation{
	
	abstract int excute(int x);
	
	IntOperation andThen(IntOperation secondOperation) {
		return new AllOperation(this, secondOperation);
	}
	
}
class AddOne extends IntOperation{

	@Override
	int excute(int x) {
		return x+1;
	}
	
}
class ChangeSign extends IntOperation{

	@Override
	int excute(int x) {
		return -x;
	}
}

class Multiply extends IntOperation{
	private int factor;
	
	public Multiply(int factor) {
		this.factor = factor;
	}
	@Override
	int excute(int x) {
		return x*factor;
	}
}

class Subtract extends IntOperation{
	private int value;
	
	public Subtract(int value) {
		this.value=value;
	}
	@Override
	int excute(int x) {
		return x - value;
	}
}

class AllOperation extends IntOperation{
	private IntOperation firstOperation;
	private IntOperation secondOperation;
	
	public AllOperation(IntOperation first , IntOperation second) {
		this.firstOperation = first;
		this.secondOperation = second;
	}
	@Override
	int excute(int x) {
		int y = firstOperation.excute(x);
		return secondOperation.excute(y);
	}
}
