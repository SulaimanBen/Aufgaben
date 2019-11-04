package KleinenAufgaben;

import java.util.Random;

class AmpelFarbe{
	public static final AmpelFarbe ROT = new AmpelFarbe();
	public static final AmpelFarbe GELB = new AmpelFarbe();
	public static final AmpelFarbe GRUEN = new AmpelFarbe();
	
	private AmpelFarbe() {}

	public static AmpelFarbe[] values() {
		return new AmpelFarbe[]{ ROT , GRUEN , GELB };
	}
}

public class AufgabeAmpelFarbe {
	
	public static void main(String[] args) {
		
		AmpelFarbe farbe = getAmpelFarbe();
		
		if ( farbe == AmpelFarbe.ROT) 
			System.out.println("Rot");
		
		else if ( farbe == AmpelFarbe.GELB) 
			System.out.println("Gelb");
		
		else if ( farbe == AmpelFarbe.GRUEN) 
			System.out.println("Gruen");
		
		else
			System.out.println("Fehler! unbekannte Farbe: " + farbe);
		
	}
	
	static AmpelFarbe getAmpelFarbe() {
		
		AmpelFarbe[] farben = AmpelFarbe.values();
		int index = new Random().nextInt(4);
		return farben[index];
	}
}
