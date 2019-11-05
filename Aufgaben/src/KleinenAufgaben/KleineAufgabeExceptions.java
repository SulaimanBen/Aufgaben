package KleinenAufgaben;

public class KleineAufgabeExceptions {

	public static void main(String[] args) {
		
		String name = "Jerry";
		name = formatName(name);
		System.out.println("Name: " + name); // JERRY
		
		try {
			name = formatName(null);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		formatName("Do");
		
	}

	private static String formatName(String name) {
		if(name.length() < 3) {
			throw new IllegalArgumentException("Der Name muss mindestens 3 Zeichen haben");
		}
		return name.toUpperCase();
	}
}
