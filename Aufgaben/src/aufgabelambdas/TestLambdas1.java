package aufgabelambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestLambdas1 {

		public static void main(String[] args) {
			
			System.out.println("*************** A1 ****************");
			IntOperation op1 = new Sum();			// Kann Summe bilden
			System.out.println( op1.execute(2, 3) ); // 5
			
			IntOperation op2 = ( x , y ) -> { return x + y; };	// hier eine Lambda zum Bilden der Summe
			System.out.println( op2.execute(2, 3) ); 		// 5
			
			IntOperation op3 = new Max(); // Kann den gr��eren Wert ermitteln
			System.out.println( op3.execute(-6, 17) ); // 17
			
			IntOperation op4 = (x,y) -> Math.max(x, y); // hier eine Lambda um den gr��eren Wert zu ermitteln
			System.out.println( op4.execute(-6, 17) ); // 17
			
			System.out.println("*************** A2 ****************");
			
			/*
			 * Bilden Sie eine ArrayList mit 4-5 Strings und sortieren Sie sie mit 
			 * Collections.sort(List, Comparator) nach L�nge.
			 * Verwenden Sie zum erzeugen vom Comparator eine Lambda-Funtion.
			 */
			
			List<String> vorlage = Arrays.asList( "ghalwelk" , "aa" , "abcde" , "aaaa" );
			ArrayList<String> list = new ArrayList<>(vorlage);
			
			System.out.println("list vor dem Sort: "+list);
			Collections.sort(list, (s1, s2) -> s1.length()-s2.length());
			System.out.println("list nach dem Sort: " + list);
			
			System.out.println("*************** A3 ****************");
			
			List<Integer> list1 = new ArrayList<>();
			// 2-3 Integer zur list1 hinzuf�gen...
			list1.add(12);
			list1.add(10);
			list1.add(22);

			List<Integer> list2 = new ArrayList<>();
			// 2-3 Integer zur lisr2 hinzuf�gen...
			list2.add(16);
			list2.add(8);
			list2.add(19);
			
			ListPair combiner = (l1 , l2 ) -> {
				List<Integer> l3 = new ArrayList<>();
				l3.addAll(l1);
				l3.addAll(l2);
				return l3;
			}; // hier die Lambda-Funktion
			List<Integer> list3 = combiner.accept(list1, list2);
			//list3 hat alle Elemente aus list1 und list2
			System.out.println(list3);
			
			
			// A4 in extra Klasse -> TestLambdas2
		}
}
