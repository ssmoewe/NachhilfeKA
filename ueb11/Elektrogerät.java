package ueb11;

public class Elektrogerät extends Geschenk {
	
	private double price;
	private String hersteller;

	public Elektrogerät(double price, String hersteller) {
		super(price);
		this.hersteller = hersteller;
	}

	public String getHersteller() {
		return hersteller;
	}

	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}

	@Override
	public String toString() {
		return "Elektrogerät [price=" + super.getPrice() + ", hersteller=" + hersteller + "]";
	}

}
