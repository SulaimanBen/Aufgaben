package Aufgabe_25sep;


public class AufgabeTiere {
	
	public static void main(String[] args) {
		
		Hund h1=new Hund("Lord", 1,"Ben");
		Hund h2=new Hund("Lord", 1,"Ben");
		
		//h1.alter=5; Private int alter  : ist nicht sichtbar
		
		
		System.out.println(h1 == h2);
		
		boolean r= h1.equals(h2);
		System.out.println(r);
		System.out.println(h2.toString());
		
	}

}

class Hund{
	
	private String name,besitzer;
	private int alter;
	
	Hund(String name,int alter){
		this(name,alter,"");
	}
	Hund(String name,int alter,String besitzer){
		this.name=name;
		this.alter=alter;
		this.besitzer=besitzer;
		
	}
	
	public String toString() {
		return "Hund heißt :"+name+"  ist "+alter+" Jhre Alt  "+besitzer;
	}
	
	public boolean equals(Object Obj) {
		Hund h1=(Hund)Obj;
		return h1.name.equals(h1.name) && h1.alter == alter && h1.besitzer == besitzer;
	}
	
	
}