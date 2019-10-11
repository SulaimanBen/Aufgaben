package Aufgaben_8Okt;

public class Figuren {
	
	private int x , y ;
	
	public void bewegen(int x , int y) {
		this.x = x;
		this.y = y; 
	}
	
	
	@Override
	public String toString() {
		return " , Koordinaten [ "+ x +" , "+ y + " ]";
	}
}
