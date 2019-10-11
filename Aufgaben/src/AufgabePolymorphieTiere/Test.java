package AufgabePolymorphieTiere;

public class Test {
	public static void main(String[] args) {
		
		Hund hund = new Hund("Rex",2,true);
		hund.laufen();
		Katze katze = new Katze("Tom",1,true);
		katze.laufen();
		
		print(hund);
		print(katze);
	}
	
	static void print(Tier tier) {
		String tierArt = tier.getClass().getSimpleName();
		String tierName = tier.getName();
		
		System.out.println(tierArt+". Name :" + tierName);
	}

}
