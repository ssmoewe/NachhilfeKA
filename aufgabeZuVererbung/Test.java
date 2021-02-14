package aufgabeZuVererbung;

public class Test {

	public static void main(String[] args) {
		
		Haustier tier = new Haustier(12, "Klops");
		Katze emma = new Katze(8, "Emma", "Linus");
		Katze luise = new Katze(8, "Luise", "Linus");
		Hund pauli = new Hund(5, "Pauli", "Doro");
		Hund nellie = new Hund(18, "Nellie", "Doro");
		
		tier.sprich();
		luise.sprich();
		nellie.sprich();
		
		emma.platz();
		pauli.platz();
		
		emma.setBesitzer("Ronja");
		luise.setName("Luise");
		System.out.println(emma.toString());
		System.out.println(tier.toString());
		
		nellie.altern();
		System.out.println(nellie.toString());
		
		nellie.setAlter(8);
		nellie.setName("Emma");
		nellie.setBesitzer("Linus");
		
		System.out.println(nellie.toString());
	}

}
