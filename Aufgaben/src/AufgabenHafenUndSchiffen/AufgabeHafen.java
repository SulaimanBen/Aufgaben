package AufgabenHafenUndSchiffen;

public class AufgabeHafen {
	public static void main(String[] args) {
		
		Schiff s1 = new Schiff("Schiff1");
		Schiff s2 = new Schiff("Schiff2");
		
		Hafen h = new Hafen();
		
		if(h.einlaufen(s1)) {
			System.out.println("true");
		}else {
			System.out.println("false s1");
		}
		
		if(h.einlaufen(s2)) {
			System.out.println("true");
		}else {
			System.out.println("false s2");
		}
		
	}

}
