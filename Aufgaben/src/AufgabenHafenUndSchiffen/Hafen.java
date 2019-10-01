package AufgabenHafenUndSchiffen;

public class Hafen {
	
	 private Schiff[] schiffe = new Schiff[100];
	 

	boolean einlaufen(Schiff s) {
		
		
		for(int i = 0; i < schiffe.length; i++) {
			if(schiffe[i] == null) {
				schiffe[i] = s;
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		int anzahlschiffe=getCountSchiffe();
		return "Hafen. (Schiffe:  "+anzahlschiffe+". Freie Plätze: "+(schiffe.length - anzahlschiffe)+")";
	}

	private int getCountSchiffe() {
		int count=0;
		for(int i = 0 ; i<schiffe.length ; i++ ) {
			if(schiffe[i] != null)
				count++;
		}
		return count;
	}
	 
	 

}
