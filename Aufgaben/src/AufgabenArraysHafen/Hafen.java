package AufgabenArraysHafen;

public class Hafen {
private Schiff[] schiffe = new Schiff[100];
	
	public boolean einlaufen(Schiff s) {
		
		for (int i = 0; i < schiffe.length; i++) {
			if(schiffe[i] == null) {
				schiffe[i] = s;
				return true;
			}
		}
		
		return false;
	}
	
	
	@Override
	public String toString() {
		int anzahlSchiffe = getCountSchiffe();
		
		return "Hafen. (Schiffe: " + anzahlSchiffe + ". Freie Pl�tze: " + (schiffe.length - anzahlSchiffe) + ")";
	}
	
	
	private int getCountSchiffe() {
		int count = 0;
		
		for (int i = 0; i < schiffe.length; i++) {
			if(schiffe[i] != null) {
				count++;
			}
		}
		
		return count;
	}
}
