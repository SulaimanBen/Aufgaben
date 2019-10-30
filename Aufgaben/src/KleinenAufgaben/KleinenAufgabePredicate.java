package KleinenAufgaben;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Kreis1 {
	private int radius;

	public Kreis1(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	@Override
	public String toString() {
		return "Kreis. R = "+radius;
	}


	
}

public class KleinenAufgabePredicate {
	
	public static void main(String[] args) {
		
		List<Kreis1> list = new ArrayList<>();
		list.add(new Kreis1(3));
		list.add(new Kreis1(17));
		list.add(new Kreis1(2));
		list.add(new Kreis1(22));
		list.add(new Kreis1(8));
		System.out.println(list);
		
		Predicate<Kreis1> p = k -> k.getRadius() > 10 ;
		
		for (Kreis1 kreis : list) {
			if ( p.test(kreis) ) {
				System.out.println(kreis);
			}
		}
		
		
	}

}
