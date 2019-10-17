package aufgabe_interfaces_default;

public interface Sum {
	
	default int add(int a, int b) {
		return a+b;
		
	}
}
