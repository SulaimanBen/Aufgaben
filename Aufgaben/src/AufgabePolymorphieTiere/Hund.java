package AufgabePolymorphieTiere;

public class Hund extends Tier {
	
	
	Hund(String name){
		super.setName(name);
	}
	Hund(String name , int alter , boolean gesund){
		super.setName(name);
		super.setAlter(alter);
		super.setGesund(gesund);
	}

	@Override
	void laufen() {
		System.out.println("Hund "+super.getName()+" läuft");
	}
}
