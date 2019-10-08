package Aufgaben_8Okt;

import java.util.Arrays;

public class vererbumgGeometrie {
	public static void main(String[] args) {
		
		Rechteck rechteck = new Rechteck(3,4);
		rechteck.bewegen(0, 0);
		System.out.println(rechteck);
		rechteck.bewegen(12, -7);
		System.out.println(rechteck);
		
		Kreis kreis = new Kreis(4);
		kreis.bewegen(0, 0);
		
		System.out.println(kreis);
		kreis.bewegen(33, 1);
		System.out.println(kreis);
	
		short[] s = $_$();
		System.out.println(Arrays.toString(s));
	}
	static short $_$()[] {{{

        return new short[007];

    }}}; 
	
}