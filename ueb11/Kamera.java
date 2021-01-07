package ueb11;

public class Kamera extends Elektroger�t {
	
	private double price;
	private String hersteller;
	private double aufl�sung;

	public Kamera(double price, String hersteller, double aufl�sung) {
		super(price, hersteller);
		this.aufl�sung = aufl�sung;
	}

	public double getAufl�sung() {
		return aufl�sung;
	}

	public void setAufl�sung(double aufl�sung) {
		this.aufl�sung = aufl�sung;
	}

	@Override
	public String toString() {
		return "Kamera [price=" + super.getPrice() + ", hersteller=" + super.getHersteller() + ", aufl�sung=" + aufl�sung + "]";
	}

}
