package aufgabe__innere_klassen_autos;

public class Rennwagen {

	private String hersteller ;
	private Fahrer fahrer ;
	private Motor motor ;
	 Rennwagen(String hersteller) {
		this.hersteller= hersteller ;
		this.motor = new Motor("Type1");
	}
	
	public class Motor{
		private String type ;
		
		public Motor(String type) {
			this.type = type ;
		}
		@Override
		public String toString() {
			return "Motor " + type +" aus dem Rennwagen "+hersteller;
		}
	}
	
	public static class Fahrer{
		private String vorname , nachname ;

		public Fahrer(String vorname, String nachname) {
			this.vorname = vorname;
			this.nachname = nachname;
		}
		
		@Override
		public String toString() {
			return vorname + " " + nachname;
		}
		
	}
	
	public void setFahrer(Fahrer fahrer) {
		this.fahrer = fahrer ;
	}
	
	public Motor getMotor() {
		return motor;
	}

	@Override
	public String toString() {
		
		return "Rennwagen " + hersteller + ". Fahrer: "+fahrer;
	}

}
