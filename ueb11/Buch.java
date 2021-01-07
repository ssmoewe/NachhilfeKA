package ueb11;

public class Buch extends Geschenk {
	
	private double price;
	private String isbn;

	public Buch(double price, String isbn) {
		super(price);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Buch [price=" + super.getPrice() + ", isbn=" + isbn + "]";
	}

}
