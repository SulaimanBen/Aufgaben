package Aufgabe_Interfaces_Comparable_Comparator_Person;

import java.util.Arrays;
import java.util.Comparator;

public class AufgabePerson {
	public static void main(String[] args) {
		
		Person[] persons = {
				new Person( "Paul" , "Smith" , 1980),
				new Person( "Paul" , "Black" , 1975),
				new Person( "John" , "Smith" , 1995),
				new Person( "John" , "Black" , 2000)
		};
		
		
		System.out.println(Arrays.toString(persons));
		
		Arrays.sort(persons);
		System.out.println(Arrays.toString(persons));
		
		int erg = Arrays.binarySearch(persons,new Person( "John" , "Black" , 2000));
		System.out.println("John Black ist in index : "+erg);
		
		Comparator<Person> comp = new Person();
		Arrays.sort(persons,comp);
		System.out.println(Arrays.toString(persons));
		
		erg = Arrays.binarySearch(persons,new Person( "John" , "Smith" , 1995) , comp);
		System.out.println("John Smith ist in index : "+erg);
		
	}
}