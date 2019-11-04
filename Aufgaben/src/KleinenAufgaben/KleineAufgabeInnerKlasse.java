package KleinenAufgaben;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// A 1

class Affe{
	private String name;
	private int groesse;
	
	public class Formatieren implements AffenFormat{

		@Override
		public String format(Affe a) {
			return "Affe: "+name+", Groesse: "+groesse;
		}
		
	}
	
	public static class CmpGroesse implements Comparator<Affe>{

		@Override
		public int compare(Affe a1, Affe a2) {
			return a1.groesse - a2.groesse;
		}
		
	}
	
	public Affe(String name, int groesse) {
		this.name = name;
		this.groesse = groesse;
	}
	
	@Override
	public String toString() {
		return name + " " + groesse;
	}
}

interface AffenFormat{
	String format(Affe a);
}

public class KleineAufgabeInnerKlasse {
	
	public static void main(String[] args) {
		
		List<Affe> list = new ArrayList<>();
		
		list.add(new Affe("Tom", 130));
		list.add(new Affe("kaiser", 90));
		list.add(new Affe("Kingkong", 2000));
		list.add(new Affe("simba", 500));
		
		print(list);
		
		System.out.println("********** Sortiert list");
		
		Affe.CmpGroesse cmp1 = new Affe.CmpGroesse();
		
		Collections.sort(list , cmp1);
		print(list);
		
		AffenFormat format ;
		
	}
	
	static void print (List<Affe> list) {
		int i = 0;
		for (Affe affe : list) {
			System.out.println(i++ + ". " + affe);
		}
	}
}