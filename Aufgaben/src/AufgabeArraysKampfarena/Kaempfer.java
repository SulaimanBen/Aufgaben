package AufgabeArraysKampfarena;

import java.util.Random;

public class Kaempfer {
	
	String KName;
	
	public Kaempfer(String KName) {
		// TODO Auto-generated constructor stub
		this.KName = KName;
	}
	
	boolean schlag() {
		Random random = new Random();
		return random.nextInt(100) < 10;
	}

	@Override
	public String toString() {
		return KName;
	}
	
	
	
}
