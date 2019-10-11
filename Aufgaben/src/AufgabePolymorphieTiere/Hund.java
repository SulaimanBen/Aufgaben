package AufgabePolymorphieTiere;

public class Hund extends Tier {
	
	
	Hund(String name , int alter , boolean gesund){
		super.setName(name);
		this.setAlter(alter);
		super.setGesund(gesund);
	}

	@Override
	void laufen() {
		System.out.println("Hund "+getName()+" läuft...");
	}
}
