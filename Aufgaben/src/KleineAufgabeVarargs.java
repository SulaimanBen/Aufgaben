
public class KleineAufgabeVarargs {
	
	public static void main(String[] args) {
		
		printArgs("sadas","dfssf");
		
	}
	
	public static void printArgs(String... s) {
	String text ="";
			System.out.println("kljhy");
		for(String x : s) {
			text += x;
			System.out.println(text);
		}
	}
	
}

