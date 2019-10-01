
public class KleineAufgabeVarargs {
	
	public static void main(String[] args) {
		
		printArgs("mo");
		printArgs("mo","di");
		printArgs("mo","di","mi");
		
	}
	
	static void printArgs(String s1,String... s2) {
		System.out.print(s1);
		for(String x : s2) {
			System.out.print(", "+x);
		}
		System.out.println();
	}
	
}

