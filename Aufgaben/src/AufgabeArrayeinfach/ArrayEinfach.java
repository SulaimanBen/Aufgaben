package AufgabeArrayeinfach;

public class ArrayEinfach {
	
	int min,max,len;
	
	public static void main(String[] args) {
		
		ArrayEinfach obj=new ArrayEinfach();
		
		int arr[]= obj.createArray(2, 15, 30);
		obj.printArray(arr);
		System.out.println("****************************************");
		
		char ch[]=obj.deutscheBuchstaben();
		
		for(char c : ch) {
			System.out.println(c);
		}
		
	}
	
	/*
	 *  A 1 : Bitte definieren Sie eine Methode 'createArray', die ein int-Array erzeugt und mit Zufallswerten belegt.
	 *         Die neue Methode soll aus der main-Methode folgendermassen aufgerufen werden koennen:
	 *         
	 *        In diesem Beispiel wird ein Array der Laenge 30 erzeugt und mit den Zufallswerten aus dem Bereich [2 .. 15] belegt.
	 */
	
	 int[] createArray(int min, int max ,int len) {
		this.min=min;
		this.max=max;
		this.len=len;
		int arr[]= new int[this.len];
		for(int i=0; i < this.len; i++) {
			arr[i]=(int)(Math.random()*(this.max-this.min)+1)+1;
			}
		return arr;
	}
	
	// A 2 : Bitte geben Sie das erzeugte Array aus.Dafür definieren Sie eine weitere Methode printArray, an die Sie das Array übergeben.
	
	 void printArray(int[] arr) {
		arr=createArray(this.min,this.max,this.len);
		
		for(int array : arr) {
			System.out.print(array + " ");
		}
		System.out.println();
	}
	 
	 // A 3 : Definieren Sie eine statische Methode deutscheUmlaute, die ein Array mit den Zeichen 'ä', 'ö' und 'ü' zurück liefert.
	 
	 static char[] deutscheUmlaute() {
		 char chUm[]= {'ä','ö','ü'};
		 return chUm;
	 }
	 
	 /*
	  *  A 4 : Definieren Sie eine statische Methode deutscheBuchstaben, 
	  *  	   die ein Array mit allen deutschen Kleinbuchstaben inklusive Umlaute und 'ß' zurück liefert.
	  */
	 
	 static char[] deutscheBuchstaben() {
		 int y = 0;
		 char ch1[]=deutscheBuchstaben();
		 char ch2[]=new char[26];
		 char ch3[]= new char[ch1.length + ch2.length];
		 
		 for(int x=0 ; x < 2 ;x++) {
			 if(x == 0) {
			 for(char i='a' ; i < ch2.length ; i++) {
				 ch3[i]=i;
			 }
			 continue;
			 }
			 else {
			 for(int j = ch1.length ; j < ch3.length ; j++) {
				 ch3[j]= ch1[y];
				 y++;
			 }
			 }
		 }
		 return ch3;
	 }
}
