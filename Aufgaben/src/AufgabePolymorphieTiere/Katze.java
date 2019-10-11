package AufgabePolymorphieTiere;

public class Katze extends Tier {
	
	
	public Katze(String name) {
		super.setName(name);
	}
	Katze(String name , int alter, boolean gesund){
		super.setName(name);
		super.setAlter(alter);
		super.setGesund(gesund);
	}

	@Override
	void laufen() {
		System.out.println("Kaze "+super.getName()+" läuft");
		
	}
}
