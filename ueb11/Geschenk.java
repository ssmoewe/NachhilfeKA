package ueb11;

public class Geschenk {
	
	private double price;
	
	public Geschenk(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Geschenk [price=" + price + "]";
	}
}
