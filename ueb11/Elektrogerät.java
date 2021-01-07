package ueb11;

public class Elektroger�t extends Geschenk {
	
	private double price;
	private String hersteller;

	public Elektroger�t(double price, String hersteller) {
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
		return "Elektroger�t [price=" + super.getPrice() + ", hersteller=" + hersteller + "]";
	}

}
