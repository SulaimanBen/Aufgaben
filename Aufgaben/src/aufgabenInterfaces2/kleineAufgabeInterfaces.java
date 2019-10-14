package aufgabenInterfaces2;

import aufgaben.Kreis;
import aufgaben.Size;

class Size {
	int size;
	
	public Size(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Size = " + size;
	}
} // End of Size

class Kreis {
	int radius;
	
	public Kreis(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Kreis. Radius = " + radius;
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
		
	} // End of main

	 static Object getMax(Object objA, Object objB) {
		 if(objA instanceof Size ) {
			 int max = Math.max(((Size) objA).size, ((Size) objB).size);
			 return new Size(max);
		 }else{
			 int max = Math.max(((Kreis) objA).radius, ((Kreis) objB).radius);
			 return new Kreis(max);
		 }
		 
	}

}
