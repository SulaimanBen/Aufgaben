package Aufgaben_1Okt;



public class KleineAufgabeKlassenObjekt {
	
	
	public static void main(String[] args) {
		Zebra z1 = new Zebra("Rosie");
		System.out.println(z1);
	}

}
class Zebra{
	private String zebraname;
	
	Zebra(String s1) {
		this.zebraname=s1;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Zebra.class.getSimpleName()+" "+zebraname;
	}
}