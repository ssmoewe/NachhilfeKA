package ueb11;

public class Handy extends Elektrogerät {
	
	private double price;
	private String hersteller;
	private double display;

	public Handy(double price, String hersteller, double display) {
		super(price, hersteller);
		this.display = display;
	}

	public double getDisplay() {
		return display;
	}

	public void setDisplay(double display) {
		this.display = display;
	}

	@Override
	public String toString() {
		return "Handy [price=" + price + ", hersteller=" + hersteller + ", display=" + display + "]";
	}

}
