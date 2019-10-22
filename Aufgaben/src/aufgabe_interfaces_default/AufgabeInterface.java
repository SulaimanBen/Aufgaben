package aufgabe_interfaces_default;

interface Sum {
	   default int add(int a, int b) {
		   return a+b;
	   }
	}
	
interface Container {
	   /* 
	    * Speichert x im Container.
	    * Liefert die neue Containergröße zurück.
	    */
	   int add(int x);
	   
	   
	   /*
	    * Überladen. 
	    * Speichert im Container x, danach y.
	    * Liefert die neue Containergröße zurück.
	    */
	   default int add(int x, int y) {
		   this.add(x);
		   this.add(y);
		   return add(x-y);
	   }
	}	

class InterfaceTesten implements Sum , Container{

	@Override
	public int add(int x) {
		return x;
	}

	@Override
	public int add(int x, int y) {
		return x+y;
	}
	
}
public class AufgabeInterface {
	
	public static void main(String[] args) {
		Sum t1 = new InterfaceTesten();
		int sum = t1.add(5, 6);
		System.out.println("Sum Klass : "+sum);
		Container c1 = new InterfaceTesten() ;
		int x = c1.add(5);
		int y = c1.add(7);
		sum = c1.add(x, y);
		System.out.println(sum);
		
	}

}
