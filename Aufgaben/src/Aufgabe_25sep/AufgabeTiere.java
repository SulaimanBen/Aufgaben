package Aufgabe_25sep;


public class AufgabeTiere {
	
	public static void main(String[] args) {
		
		Hund h1=new Hund("h1", 1);
		Hund h2=new Hund("h2", 2,"+");
		
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
		return "Hund heißt :"+name+"  ist "+alter+" Jhre Alt"+besitzer;
	}
	
	public boolean equals(Object Obj) {
		Hund H2=(Hund)Obj;
		Hund H1=(Hund)Obj;
		return H1 == H2;
	}
	
	
}