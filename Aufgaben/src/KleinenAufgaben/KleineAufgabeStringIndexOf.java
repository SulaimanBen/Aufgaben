package KleinenAufgaben;

public class KleineAufgabeStringIndexOf {
	
	public static void main(String[] args) {
		
		String s = "Die Note Do ist nicht dasselbe wie Do, wenn Do für Donnerstag steht";
		
		// A1
		
		//a1a(s , "Do");
		a1b(s , "Do");
		
	}
	
	static void a1a(String s1 , String s2) {
		for(int i = 0 ; i < s1.length() - s2.length() ; i++) {
			if(s1.startsWith(s2,i)) {
				System.out.println(i);
			}
		}
	}
	
	static void a1b(String s1, String s2) {
		for (int i = 0; i < s1.length() - s2.length(); i++) {
			
			int index = s1.indexOf(s2,i);
			if(index == i) {
				System.out.println(i);
				i = index;
			}
			
		}
	}

}
