package aufgabelambdas;

import java.util.ArrayList;

interface Lambdas{
	void print( int anzahlKerne , String hersteller );
}

class CPU{
	@SuppressWarnings("unused")
	private int anzahlKerne;
	private String hersteller;
	
	public String getHersteller() {
		return hersteller;
	}

	public CPU( int anzahlKerne , String hersteller ) {
		this.anzahlKerne = anzahlKerne;
		this.hersteller = hersteller;
	}
}
public class TestLambdas2 {

	public static void main(String[] args) {
		
		ArrayList<CPU> list = new ArrayList<>();
		
		list.add(new CPU(4, "AMD"));
		list.add(new CPU(6, "Intel"));
		list.add(new CPU(2, "Samsung"));
		
		list.forEach( cpu -> System.out.println(cpu.getHersteller()) );

	}

}
