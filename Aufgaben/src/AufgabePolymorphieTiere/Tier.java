package AufgabePolymorphieTiere;

public abstract  class Tier {
	
	private String name;
	private int alter;
	private boolean gesund;
	
	abstract void laufen();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public boolean isGesund() {
		return gesund;
	}
	public void setGesund(boolean gesund) {
		this.gesund = gesund;
	}
	
}
