package aufgabe_enums_hunderassen;

enum Hunderasse{
	DACKEL(0.5),
	COLLIE(1.0),
	DOGGE(1.5);
	
	final double maxGroesse;
	
	private Hunderasse(double maxGroesse) {
		this.maxGroesse = maxGroesse;
	}
	@Override
	public String toString() {
		return this.name() + ", max. Groesse: " + maxGroesse;
	}
}

public class AufgabeHunderassen {
	
	public static void main(String[] args) {
		for (Hunderasse value : Hunderasse.values()) {
			System.out.println(value);
		}
	}
}
