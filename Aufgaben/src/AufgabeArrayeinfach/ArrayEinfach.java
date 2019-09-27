package AufgabeArrayeinfach;

public class ArrayEinfach {
	
	
	public static void main(String[] args) {
		
		ArrayEinfach obj=new ArrayEinfach();
		
		int arr[]= obj.createArray(2, 15, 30);
		obj.printArray(arr);
		System.out.println("****************************************");
		
		char ch[]= obj.deutscheBuchstaben();		
		
		for( char c : ch) {
			System.out.print(c + " ");
		}
		
	}
	
	/*
	 *  A 1 : Bitte definieren Sie eine Methode 'createArray', die ein int-Array erzeugt und mit Zufallswerten belegt.
	 *         Die neue Methode soll aus der main-Methode folgendermassen aufgerufen werden koennen:
	 *         
	 *        In diesem Beispiel wird ein Array der Laenge 30 erzeugt und mit den Zufallswerten aus dem Bereich [2 .. 15] belegt.
	 */
	
	 int[] createArray(int min, int max ,int len) {
		int arr[]= new int[len];
		for(int i=0; i < len; i++) {
			arr[i]=(int)(Math.random()*(max-min)+1)+1;
			}
		return arr;
	}
	
	// A 2 : Bitte geben Sie das erzeugte Array aus.Dafür definieren Sie eine weitere Methode printArray, an die Sie das Array �bergeben.
	
	 void printArray(int[] arr) {
		
		for(int array : arr) {
			System.out.print(array + " ");
		}
		System.out.println();
	}
	 
	 // A 3 : Definieren Sie eine statische Methode deutscheUmlaute, die ein Array mit den Zeichen 'ä', 'ö' und 'ü' zur�ck liefert.
	 
	 static char[] deutscheUmlaute() {
		return  new char[]{'ä','ö','ü'};
		
	 }
	 
	 /*
	  *  A 4 : Definieren Sie eine statische Methode deutscheBuchstaben, 
	  *  	   die ein Array mit allen deutschen Kleinbuchstaben inklusive Umlaute und 'ß' zurück liefert.
	  */
	 
	 static char[] deutscheBuchstaben() {
		 int y=0;
		 char ch1[]=deutscheUmlaute();
		 char ch2[]=new char[26];
		 char ch3[]= new char[30];
		 
			 for(char i='a' ; i <= 'z'  ; i++) {
				 ch2[y++]=i;
			 }
			 for(int i2 = 0 ; i2 < ch2.length ; i2++) {
				 ch3[i2]= ch2[i2];
			 }
			 int z=0;
			 for (int i3=ch2.length; i3< ch3.length; i3++) {
				 ch3[i3]=ch1[z++];
			 }
		 return ch3;
	 }
}
