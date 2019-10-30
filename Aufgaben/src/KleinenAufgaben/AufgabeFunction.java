package KleinenAufgaben;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class AufgabeFunction {
	
	static class IsNegative implements Predicate<Integer>{

		@Override
		public boolean test(Integer n) {
			return n < 0;
		}
		
	}

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(-3);
		list.add(55);
		list.add(-17);
		list.add(100);
		
		List<Integer> listCopy = new ArrayList<>(list);
		System.out.println(listCopy);
		
		Predicate<Integer> filter = new IsNegative();
		
		listCopy.removeIf(filter);
		System.out.println(listCopy);
		
		listCopy = new ArrayList<>(list);
		listCopy.removeIf(n -> n > 0);
		System.out.println(listCopy);
		
		
		Function<Integer, Integer> f = x -> x*2;
		
		int result = f.apply(12);
		System.out.println( result );
		
	}
}
