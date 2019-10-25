package aufgabearraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class ArrayList_Aufgabe {
	
	static List<Integer> createZufaelligArrayList(int size , int min , int max){
		Random random = new Random();
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < size; i++) {
			list.add(random.nextInt( max - min + 1 ) + min );
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
		
		a1();
		a2();
		a3();
		a4();
		
		System.out.println("********** A5 **********");
		
		Integer[] arr = { 1 , 4 , 6 };
		
		List<Integer> list = Arrays.asList(arr);
		System.out.println("List : "+list);
		
		Collection<Integer> c = list;
		System.out.println("Collection : "+c);
		
		Iterable<Integer> it = list;
		System.out.println("Iterable : "+it);
	}

	private static void a4() {
		System.out.println("********** A4 **********");
		List<Integer> list = createZufaelligArrayList(10, 0, 50);
		Object[] arr = list.toArray();
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static void a3() {
		System.out.println("********** A3 **********");
		
		List<Integer> list = createZufaelligArrayList(10, 0, 50);
		System.out.println("list Befor replaceAll() : "+list);
		list.replaceAll(num -> 0);
		System.out.println("list After replaceAll() : "+list);
	}

	private static void a2() {
		System.out.println("********** A2 **********");
		
		List<Integer> list = createZufaelligArrayList(10, 0, 50);
		System.out.println("list Befor removeIf() : "+list);
		
		list.removeIf(num ->(num % 2 != 0));
		System.out.println("list After removeIf() : "+list);
		
	}

	private static void a1() {
		System.out.println("********** A1 **********");
		
		List<String> wochentag = new ArrayList<>();
		
		wochentag.add("mo");
		wochentag.add("di");
		wochentag.add("mi");
		wochentag.add("do");
		wochentag.add("fr");
		System.out.println(wochentag);
		
		Iterable<String> iterable = wochentag;
		Iterator<String> iterator = iterable.iterator();
		
		while( iterator.hasNext() ) {
			String e = iterator.next();
			System.out.println(e);
		}
	}

}
