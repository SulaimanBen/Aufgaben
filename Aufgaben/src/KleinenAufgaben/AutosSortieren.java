package KleinenAufgaben;

import java.util.Arrays;

class Auto implements Comparable<Auto>{
	private int baujahr;
	private String hersteller;
	public Auto(int baujahr, String hersteller) {
		this.baujahr = baujahr;
		this.hersteller = hersteller;
	}
	@Override
	public String toString() {
		return "Auto baujahr=" + baujahr + ", hersteller : " + hersteller;
	}
	@Override
	public int compareTo(Auto o) {
		int erg = hersteller.compareTo(o.hersteller);
		if(erg == 0 ) {
			erg = baujahr - o.baujahr;
		}
		return erg;
	}
	
	
}

public class AutosSortieren {
	public static void main(String[] args) {
		
		Auto[] autos = {
				new Auto(2019,"Audi"),
				new Auto(1999,"Golf"),
				new Auto(2015,"Benz"),
		};
		
		print(autos);
		
		Arrays.sort(autos);
		
		print(autos);
		
	}
	
	static void print(Auto[] autos) {
		
		for (int i = 0; i < autos.length; i++) {
			System.out.println(i+ ". "+ autos[i]);
			
		}
		
	}

}
