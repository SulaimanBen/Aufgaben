package Aufgabe.Polymorphie.Geometrie;

import java.util.Random;

public class PolymorphieGeometrie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rechteck r1 = new Rechteck(10 , 5);
		System.out.println(r1);
		
		int flaeche = (int) r1.getFlaeche();
		System.out.println("Rechteck Fläche : " + flaeche);
		
		Kreis k1 = new Kreis(5);
		System.out.println(k1);
		double flaecheK = k1.getFlaeche();
		System.out.println("Kreis Fläche : "+flaecheK);
		
		Figuren[] array = new Figuren[10];
		Random random = new Random();
		for( int i = 0 ; i < array.length ; i++ ) {
			if( random.nextBoolean()) {
				int breite = random.nextInt(20)+1;
				int hoehe = random.nextInt(20)+1;
				array[i] = new Rechteck(breite, hoehe);
			}
			else {
				int radius = random.nextInt(20)+1;
				array[i] = new Kreis(radius);
		
			}
		}
		
		print(array);
		printFlaechen(array);
	}
	
	static void printFlaechen(Figuren[] array) {
		System.out.println("Fläche für Figuren");
		for( int i = 0 ; i < array.length ; i++) {
			Figuren figur = array[i];
			double flaeche = figur.getFlaeche();
			System.out.println(i + 1 + ". "+ figur);
			System.out.println("Fläche : "+flaeche);
		}
		
	}

	static void print(Figuren[] array) {
		System.out.println("Figuren aus dem Array");
		for( int i = 0 ; i < array.length ; i++) {
			System.out.println(i + 1 + ". "+ array[i]);
		}
		
	}

}
