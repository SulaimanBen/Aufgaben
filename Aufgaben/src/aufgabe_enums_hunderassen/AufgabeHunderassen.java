package aufgabe_enums_hunderassen;

enum Hunderasse {
	DACKEL(.5),
	COLLIE(1),
	DOGGE(1.5);

	private final double maxGroesse;
	
	Hunderasse(double maxGroesse) {
		this.maxGroesse = maxGroesse;
	}
	
	@Override
	public String toString() {
		String name = name().charAt(0)+ name().substring(1).toLowerCase();
		return name + ", max. Groesse: " + maxGroesse;
	}
}

public class AufgabeHunderassen {
	
	public static void main(String[] args) {
		
		for (Hunderasse value : Hunderasse.values()) {
			System.out.println(value);
			
		}
	}
}
