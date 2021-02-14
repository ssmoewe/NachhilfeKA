package aufgabeZuVererbung;

public class Katze extends Haustier {
	
	private String besitzer;

	public Katze(int alter, String name, String besitzer) {
		super(alter, name);
		this.besitzer = besitzer;
	}

	public String getBesitzer() {
		return besitzer;
	}

	public void setBesitzer(String besitzer) {
		this.besitzer = besitzer;
	}
	
	public void setName(String name) {
		if(super.getName() == name) {
			System.out.println("Diese Katze heißt schon " + name);
		} else {
			super.setName(name);
		}
	}
	
	public void sprich() {
		System.out.println("Miau");
	}
	
	public void platz() {
		System.out.println(super.getName() + " ignoriert deinen Befehl!");
	}
	
	public void altern() {
		super.setAlter(super.getAlter() + 1);
	}
	
	public String toString() {
		return "Diese Katze heißt " + super.getName() + ", ist " + super.getAlter() + " Jahre alt und gehört " + besitzer;
	}

}
