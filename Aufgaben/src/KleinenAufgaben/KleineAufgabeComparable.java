package KleinenAufgaben;

import java.util.Arrays;
import java.util.Random;

class Kreis implements Comparable<Kreis1> {
	private int radius;

	public Kreis(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Radius "+radius;
	}

	@Override
	public int compareTo(Kreis1 o) {
		return radius - o.getRadius();
	}
	
}
public class KleineAufgabeComparable {
	public static void main(String[] args) {
		
		Kreis1[] arrK = new Kreis1[10];
		Random random = new Random();
		for (int i = 0; i < arrK.length; i++) {
			arrK[i]= new Kreis1(random.nextInt(10)+1);
			System.out.println(i+1 + ". "+ arrK[i]);
		}
		System.out.println("nach dem Sortieren");
		Arrays.sort(arrK);
		int x =1;
		for( Kreis1 k : arrK) {
			System.out.println(x++ +". "+k);
		}
		
		
		
	}
	

}
