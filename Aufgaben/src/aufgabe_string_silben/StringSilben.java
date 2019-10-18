package aufgabe_string_silben;

import java.util.Random;

public class StringSilben {
	
	public static final String[] SILBEN=
		{"pro","get","idre","su","ola","im","se","fo","ral","els","fal","man","th","mu"};
	
	public static void main(String[] args) {
		
		String name = generierename(SILBEN, 4);
		System.out.println(name);
		System.out.println("**************************************");
		namenGenrieren( 50 , SILBEN , 3 );
		
		
	} // End of main
	
	static String generierename(String[] silben, int anzahlSilben) {
		String name = "";
		Random random = new Random();
		for (int i = 0; i < anzahlSilben; i++) {
			name =name.concat(silben[random.nextInt(silben.length)]);
		}
		
		String firstLetter = name.charAt(0) + "";
		return firstLetter.toUpperCase()+name.substring(1);
	}
	
	static void namenGenrieren(int anzahl, String[] silben, int anzahlSilben) {
		for( int i = 1 ; i <= anzahl ; i++ ) {
			System.out.println(i+". "+generierename(silben, anzahlSilben));
		}
	}
}
