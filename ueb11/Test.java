package ueb11;

public class Test {

	public static void main(String[] args) {
		
		Person oleg = new Person("Oleg", 4);
		Gutschein edeka = new Gutschein(12.5, "Edeka", 7.5);
		Gutschein penny = new Gutschein(25, "Penny", 20);
		Buch java = new Buch(19.99, "235986");
		Handy pixel = new Handy(499.99, "Google", 12.5);
		Kamera obscura = new Kamera(Double.MAX_VALUE, "Aristoteles", 1);
		
		oleg.geschenkUeberreichen(obscura);
		oleg.geschenkUeberreichen(pixel);
		oleg.geschenkUeberreichen(penny);
		oleg.geschenkUeberreichen(edeka);
		
		oleg.geschenkeAusgeben();
		penny.gutscheinEinlösen(26);
	}

}
