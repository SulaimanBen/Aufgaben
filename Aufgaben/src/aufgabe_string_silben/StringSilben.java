package aufgabe_string_silben;

import java.util.Random;

public class StringSilben {
	
	public static void main(String[] args) {
		
		String[] silben= {"pro","get","set","gam","col","jit","hell","gin","ral","els","fal","man"};
		String name = generiere(silben, 4);
		System.out.println(name);
		namenGenrieren(50,silben,4);
		
	}
	
	static String generiere(String[] arrayMitSilben, int x) {
		String name = "";
		Random random = new Random();
		for (int i = 0; i < x; i++) {
			name += arrayMitSilben[random.nextInt(arrayMitSilben.length-1)+1];
		}
		
		return name;
	}
	
	static void namenGenrieren(int anzahl, String[] arrayMitSilben, int x) {
		for( int i = 1 ; i <= anzahl ; i++ ) {
			System.out.println(i+". "+generiere(arrayMitSilben, x));
		}
	}
}
