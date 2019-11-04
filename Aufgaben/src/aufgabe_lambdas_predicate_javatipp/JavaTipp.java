package aufgabe_lambdas_predicate_javatipp;

import java.util.ArrayList;

public class JavaTipp {
	
	private static final int MAX_THEMEN = 3;

	private String text ;
	
	private final ArrayList<String> themen = new ArrayList<>();
	
	public JavaTipp(String text) {
		this.text = text;
	}
	
	public void addThema(String thema) {
		if ( themen.contains(thema) ) {
			System.out.println("Das Thema ist bereits gespeicher "+ thema);
			return ;
		}
		
		if( themen.size() == MAX_THEMEN ) {
			System.out.println("Maximale Anzahl der Themen erreicht");
			return;
		}
		
		themen.add(thema);
	}
	
	public void addThemen(String... themen) {
		for (String thema : themen) {
			addThema(thema);
		}
	}

	public String getText() {
		return text;
	}

	public ArrayList<String> getThemen() {
		return new ArrayList<>(themen);
	}
	
}
