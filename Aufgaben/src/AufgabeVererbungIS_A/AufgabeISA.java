package AufgabeVererbungIS_A;

public class AufgabeISA {
	
	public static void main(String[] args) {
		
	}

}
interface Tankbar{}

class Fahrrad implements Tankbar{}
class LKW implements Tankbar{}
class Kraftfahrzeug implements Tankbar{}
class Segelboot implements Tankbar{}
class Fahrzeug implements Tankbar{
	int baujahr;
}
class Tankstelle implements Tankbar{
	void betanken(Tankbar t) {
		
	}
}

interface Lebewesen{}
interface Lauff�hig{
	void laufen();
}
class Mensch extends Nase implements Lebewesen , Lauff�hig{

	@Override
	public void laufen() {
		// TODO Auto-generated method stub
		
	}
}
class Nase {}
class Karotte{}