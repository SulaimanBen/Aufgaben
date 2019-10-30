package aufgabelambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Astronaut {
	private String name;

	public Astronaut(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Astronaut " + name;
	}
}
public class KleinenAufgabeFunctional {

	public static void main(String[] args) {
		
		String[] namen = { "Tom" , "Jerry" , "Peter" , "Paul" , "Mary" , "Ute" };
		
		List<Astronaut> listA = buildMannschaft(namen , n -> new Astronaut(n));
		System.out.println(listA);
	}

	private static List<Astronaut> buildMannschaft(String[] namen, Function<String , Astronaut> f) {
		List<Astronaut> list = new ArrayList<>();
		for (String s : namen) {
			Astronaut a = f.apply(s);
			list.add(a);
		}
		return list;
	}

}
