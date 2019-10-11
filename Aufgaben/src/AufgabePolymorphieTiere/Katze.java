package AufgabePolymorphieTiere;

public class Katze extends Tier {
	
	Katze(String name , int alter, boolean gesund){
		this.setName(name);
		this.setAlter(alter);
		super.setGesund(gesund);
	}

	@Override
	void laufen() {
		System.out.println("Kaze "+super.getName()+" läuft...");
		
	}
}
