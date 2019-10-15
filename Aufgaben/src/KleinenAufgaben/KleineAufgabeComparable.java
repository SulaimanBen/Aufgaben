package KleinenAufgaben;

import java.util.Arrays;
import java.util.Random;

class Kreis implements Comparable<Kreis> {
	private int radius;

	public Kreis(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Radius "+radius;
	}

	@Override
	public int compareTo(Kreis o) {
		return radius - o.radius;
	}
	
}
public class KleineAufgabeComparable {
	public static void main(String[] args) {
		
		Kreis[] arrK = new Kreis[10];
		Random random = new Random();
		for (int i = 0; i < arrK.length; i++) {
			arrK[i]= new Kreis(random.nextInt(10)+1);
			System.out.println(i+1 + ". "+ arrK[i]);
		}
		System.out.println("nach dem Sortieren");
		Arrays.sort(arrK);
		int x =1;
		for( Kreis k : arrK) {
			System.out.println(x++ +". "+k);
		}
	}
	

}
