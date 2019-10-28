package aufgabe_personen2;

import java.util.ArrayList;

interface Filter{

	public abstract boolean istOK(int value);
}

class FilterGerade implements Filter{

	@Override
	public boolean istOK(int value) {
		return value % 2 == 0;
	}
}

class FilterPositive implements Filter{

	@Override
	public boolean istOK(int value) {
		return value > 0;
	}	
}

class FilterStartMit1 implements Filter{

	@Override
	public boolean istOK(int value) {
		String s = String.valueOf(Math.abs(value));
		return s.charAt(0) == '1';
	}
	
}

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
		list.add(-17);
		
		System.out.println("list : "+list);
		
		System.out.println("******** A2 *******");
		
		ArrayList<Integer> listGerade = filtern(list, new FilterGerade());
		System.out.println("list gerade : "+listGerade);
		
		ArrayList<Integer> listPositive = filtern(list,new FilterPositive());
		System.out.println("list Positive : "+listPositive);
		
		ArrayList<Integer> listStartMit1 = filtern(list,new FilterStartMit1());
		System.out.println("list Start mit 1 : "+listStartMit1);
		
		
	}

	private static ArrayList<Integer> filtern(ArrayList<Integer> list , Filter filter ){
		ArrayList<Integer> list2 =  new ArrayList<>();
		
		for (Integer value : list) {
			if (filter.istOK(value)) {
				list2.add(value);
			}
		}
		
		return list2;
	}
	
	

}
