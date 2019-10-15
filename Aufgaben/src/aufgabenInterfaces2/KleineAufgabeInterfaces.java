package aufgabenInterfaces2;

interface Vergleichbar{

	int vergleicheMit(Vergleichbar b);
	
}

class Size implements Vergleichbar{
	int size;
	
	public Size(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Size = " + size;
	}

	@Override
	public int vergleicheMit(Vergleichbar b) {
		Size s2 = (Size)b;
		return this.size - s2.size;
	}
} // End of Size

class Kreis implements Vergleichbar {
	int radius;
	
	public Kreis(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Kreis. Radius = " + radius;
	}

	@Override
	public int vergleicheMit(Vergleichbar b) { 
		return radius - ((Kreis)b).radius;
	}
}


public class KleineAufgabeInterfaces {
	
	public static void main(String[] args) {
		
		Size s1 = new Size(20);
		System.out.println(s1); // Size = 20
		
		Kreis k1 = new Kreis(3);
		System.out.println(k1); // Kreis. Radius = 3
		
		Size sA = new Size(12);
		Size sB = new Size(7);
		System.out.println(getMax(sA , sB)); // Size = 12
		
		Kreis kA = new Kreis(4);
		Kreis kB = new Kreis(77);
		System.out.println(getMax(kA , kB)); // Kreis = 12
		
		getMax(sB , sA);
		
	} // End of main

	/*
	 *  1 Lösung ohne Polymorphie .. (nicht so gut)
	 */
	 static Object getMax(Object objA, Object objB) {
		 if(objA instanceof Size ) {
			 int max = Math.max(((Size) objA).size, ((Size) objB).size);
			 return new Size(max);
		 }else{
			 int max = Math.max(((Kreis) objA).radius, ((Kreis) objB).radius);
			 return new Kreis(max);
		 }
		 
	}
	 
	 /*
	  *  2 Lösung mit Interface und Polymorphie
	  */
	 
	 static Vergleichbar getMax(Vergleichbar a, Vergleichbar b) {
		 if( a.vergleicheMit(b) > 0 ) {
			 return a;
		 } else {
			 return b;
		 }
	 }

}
