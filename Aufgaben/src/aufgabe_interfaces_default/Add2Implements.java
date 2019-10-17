package aufgabe_interfaces_default;

public class Add2Implements implements Sum , Container {

	@Override
	public int add(int container) {
		
		return container;
	}

	@Override
	public int add(int x, int y) {
		
		return Container.super.add(x, y);
	}

}
