package aufgabe_arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListAufgabe {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list =createArraylist(20);
		arraylistPrint(list);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("mo");
		list2.add("di");
		list2.add("mi");
		list2.add("o");
		list2.add("fr");
		
		for (String arr : list2)
			System.out.print(arr + " ");
		
		System.out.println("******************************************");
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(40);
		list3.add(50);
		list3.add(60);
		list3.add(70);
		list3.add(80);
		for (int i = 0; i < list3.size() ; i+=2) {
			System.out.print(list3.get(i) + " " + list3.get(i+1));
			System.out.println();
		}
		
		System.out.println("*********************************************");
		
		for (int i = list3.size()-1; i >= 0; i--) {
			System.out.print( list3.get(i)+" ");
			
		}
	}
	
	static ArrayList<Integer> createArraylist(int size) {
		Random random = new Random();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < size; i++) {
			
			list.add(random.nextInt(200)-100);
		}
		return list;
	}
	
	static void arraylistPrint(ArrayList<Integer> list) {
		int index = 0 ;
		String fmt = "| %02d| %5s|%n";
		for(Integer arr : list)
			System.out.printf(fmt,index++ ,arr );
	}
}
