package aufgabe_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Sportart implements Comparable<Sportart>{
	
	private String name;
	private boolean olympisch;
	
	public Sportart(String name, boolean olympisch) {
		this.name = name;
		this.olympisch = olympisch;
	}
	
	@Override
	public String toString() {
		return name + ". Olympisch: "+ olympisch;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Sportart))
			return false;
		
		Sportart sp2 = (Sportart)obj;
		return name.equals(sp2.name) && olympisch == sp2.olympisch;
	}

	@Override
	public int compareTo(Sportart sp2) {
		int erg = name.compareTo(sp2.name);
		
		if (erg == 0)
			erg = Boolean.valueOf(olympisch).compareTo(Boolean.valueOf(sp2.olympisch));
		
		return erg;
	}
}

public class AufgabeSportart {
	
	public static void main(String[] args) {
		
		List<Sportart> list = new ArrayList<>();
		
		list.add(new Sportart("Turnen", true));
		list.add(new Sportart("Reiten", false));
		list.add(new Sportart("Bowlen", false));
		list.add(new Sportart("Ringen", true));
		list.add(new Sportart("Spatzieren", false));
		list.add(new Sportart("Fechten", true));
		
		for(Sportart sportart : list)
			System.out.println(sportart);
		
		System.out.println("****** Ringen Contains *******");
		Sportart ringen = new Sportart("Ringen", true);
		System.out.println(list.contains(ringen));
		
		System.out.println("BinarySearch nach Fechten");
		Sportart fechten = new Sportart("Fechten", true);
		
		Collections.sort(list);
		int index = Collections.binarySearch(list, fechten);
		System.out.println(index);
	}

}
