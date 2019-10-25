package aufgabe_personen2;

import java.util.ArrayList;
import java.util.List;

public class AufgabeFiltern {
	
	public static void main(String[] args) {
		
		System.out.println("******** A1 *******");
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(-4);
		list.add(77);
		
		System.out.println("list : "+list);
		
		System.out.println("******** A2 *******");
		
		ArrayList<Integer> listGerade = filtern(list, 1);
		System.out.println("list gerade : "+listGerade);
		
	}

	private static ArrayList<Integer> filtern(ArrayList<Integer> list , int num) {
		
		ArrayList<Integer> list2 =  list;
		
		
		list2.removeIf( n ->(n <= num));
		return list2;
	}
	
	

}
