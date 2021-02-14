package aufgabeZuVererbung;

public class Hund extends Haustier {
	
	String besitzer;

	public Hund(int alter, String name, String besitzer) {
		super(alter, name);
		this.besitzer = besitzer;
	}

	public String getBesitzer() {
		return besitzer;
	}

	public void setBesitzer(String besitzer) {
		this.besitzer = besitzer;
	}
	
	public void sprich() {
		System.out.println("Wuff");
	}
	
	public void platz() {
		if(super.getAlter() > 5) {
			System.out.println(super.getName() + " nimmt Platz");
		} else {
			System.out.println(super.getName() + " ignoriert deinen Befehl!");
		}
	}
	
	public void altern() {
		int neuesAlter = (super.getAlter() + 1) % 7;
		super.setAlter(neuesAlter);
	}
	
	public String toString() {
		return "Dieser Hund heißt " + super.getName() + ", ist " + super.getAlter() + " Jahre alt und gehört " + besitzer;
	}


}
