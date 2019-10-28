package aufgabe_string_stringbuilder;

public class StringBuilderAufgabe {
	
	public static void main(String[] args) {
		
		  /*
		   * In einer Schleife konkatienieren Sie wiederholt die Variablen zu einem Gesamtstring.
		   * Die Anzahl der Schleifenwiederholungen wählen Sie selbst aus.
		   * Messen Sie die Zeit vor und nach der Schleife und ermitteln Sie am Ende die Zeitdifferenz.
		   */
		long startTime1 = System.nanoTime();
		System.out.println("Start Time1 : "+startTime1/1000000);
		
//		stringKonkatinieren(10);
		stringBuilderKonkatinieren(10);
		
		long endTime1 = System.nanoTime();
		System.out.println("EndTime1 : "+endTime1/1000000);
		
		long zeitdifferenz= endTime1 - startTime1;
		System.out.println("Zeitdifferenz = "+ zeitdifferenz);  
		
		
	}
	
	private static void stringBuilderKonkatinieren(int anzahl) {
		
		  String s1 = "Hello";
		  String s2 = " ";
		  String s3 = "Welt";
		  
		  StringBuilder sb = new StringBuilder();
		  
		  for (int i = 0; i < anzahl; i++) {
			  
			  sb.append(s1);
			  sb.append(s2);
			  sb.append(s3);
			  System.out.print(sb+"\n");
			  sb.setLength(0);
		}
		
	}

	private static void stringKonkatinieren(int anzahl){
		
		  String s1 = "Hello";
		  String s2 = " ";
		  String s3 = "Welt";
		  
		  String st = "";
		  
		  for (int i = 0; i < anzahl; i++) {
			
			st += s1 + s2 + s3;
			System.out.print(st+"\n");
			st="";
		}
	}

}
