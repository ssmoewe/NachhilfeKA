package aufgabeZuVererbung;

public class Haustier {
	
	private int alter;
	private String name;

	public Haustier(int alter, String name) {
		this.alter = alter;
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sprich() {
		System.out.println("SPRICH nicht definiert für HAUSTIER");
	}
	
	public void platz() {
		System.out.println(name + " weiß nicht wie das geht");
	}
	
	public String toString() {
		return "HAUSTIER - NAME (" + name + "), ALTER: (" + alter + ")";
	}

}
