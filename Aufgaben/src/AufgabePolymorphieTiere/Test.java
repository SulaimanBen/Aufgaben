package AufgabePolymorphieTiere;

public class Test {
	public static void main(String[] args) {
		
		Tier hund = new Hund("Rex");
		hund.laufen();
		Tier kaze = new Katze("Tom");
		kaze.laufen();
		
		print(hund);
		print(kaze);
	}
	
	static void print(Tier tier) {
		if(tier instanceof Hund) {
			System.out.println("Hund Name :" + tier.getName());
		}
		else if ( tier instanceof Katze) {
			System.out.println("Kaze Name :"+ tier.getName());
		}
	}

}
