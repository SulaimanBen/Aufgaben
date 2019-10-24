package aufgabe_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayListAufgabe {
	
	private static List<Integer> createZahlVon10Bis80(){
		List<Integer> list = new ArrayList<>();
		for (int value = 10 ; value <= 80 ; value+=10) {
			list.add(value);
		}
		return list;
	}
	
	private static List<Integer> createZufaelligZahl(int size, int min, int max){
		Random random = new Random();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			
			list.add(random.nextInt(max-min+1)+min);
		}
		return  list;
	}
	
	public static void main(String[] args) {
		
		a1();
		a2();
		a3();
		a4();
		a5();
		a6();
		a7();
		a8();
		a9();
		a12();
		
	}
	
	private static void a12() {
		System.out.println("*********** A12 **********");
		  int[] a1 = { 1, 2, 3};
		  int[] a2 = { -7, -5 };
		  int[] a3 = { 101, 202, 303 };
		  
		  List<int[]> list = new ArrayList<>();
		
		  list.add(a1);
		  list.add(a2);
		  list.add(a3);
		  
		  for (int[] element : list) {
			System.out.println(Arrays.toString(element));
		}
	}

	private static void a9() {
		System.out.println("*********** A8 **********");
		List<Integer> list = createZufaelligZahl(10, 0, 50);
		System.out.println("list = "+list);
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)%2 != 0) {
				list.set(i, 0);
			}
			
		}
		System.out.println(list);
		
	}

	private static void a8() {
		System.out.println("*********** A8 **********");
		List<Integer> list = createZufaelligZahl(10, 0, 50);
		System.out.println("list = "+list);
		
		for (int i = 0; i < list.size(); i++) {
			
			if(list.get(i)%2 == 0)
				continue;
			else
				list.remove(i);
		}
		System.out.println("list = "+list);
		
	}

	private static void a7() {
		System.out.println("*********** A7 **********");
		List<Integer> list = createZufaelligZahl(10, 0, 50);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("indexOf(12) : "+Collections.binarySearch(list, 12));
	}

	private static void a6() {
		System.out.println("*********** A6 **********");
		List<Integer> list = createZufaelligZahl(10, 10, 15);
		System.out.println(list);
		System.out.println("indexOf(12) : "+ list.indexOf(12));
	}

	private static void a5() {
		System.out.println("*********** A5 **********");
		
		List<Integer> list = createZufaelligZahl(20, -100, 100);
		System.out.println("list = "+ list);
		Collections.sort(list);
		System.out.println("Sortierte Liste = "+ list);
	}

	private static void a4() {
		System.out.println("*********** A4 **********");
		List<Integer> list = createZahlVon10Bis80();
		
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.println(list.get(i));
			
		}
		
	}

	private static void a3() {
		System.out.println("*********** A3 **********");
		List<Integer> list = createZahlVon10Bis80();
		System.out.println(list);
		for (int i = 1; i < list.size() ; i+=2) {
			System.out.println( list.get(i));
		}
		
	}

	private static void a2() {
		System.out.println("*********** A2 **********");
		Collection<String> list = new ArrayList<>();
		list.add("mo");
		list.add("di");
		list.add("mi");
		list.add("do");
		list.add("fr");
		
		for (String arr : list)
			System.out.print(arr + " ");
		System.out.println();
		
	}

	private static void a1() {
		System.out.println("*********** A1 **********");
		Random random = new Random();
		
		List<Integer> list = createZufaelligZahl(20 , -100 , 100);
		
		String fmt = "| %02d| %5s|%n";
		for (int i = 0; i < list.size() ; i++) {
			System.out.printf(fmt,i,list.get(i));
			}
	}

}
