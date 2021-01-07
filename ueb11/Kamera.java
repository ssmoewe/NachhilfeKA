package ueb11;

public class Kamera extends Elektrogerät {
	
	private double price;
	private String hersteller;
	private double auflösung;

	public Kamera(double price, String hersteller, double auflösung) {
		super(price, hersteller);
		this.auflösung = auflösung;
	}

	public double getAuflösung() {
		return auflösung;
	}

	public void setAuflösung(double auflösung) {
		this.auflösung = auflösung;
	}

	@Override
	public String toString() {
		return "Kamera [price=" + super.getPrice() + ", hersteller=" + super.getHersteller() + ", auflösung=" + auflösung + "]";
	}

}
