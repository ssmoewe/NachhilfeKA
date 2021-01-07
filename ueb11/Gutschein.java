package ueb11;

public class Gutschein extends Geschenk {
	
	private double price;
	private String gesch�ft;
	private double wert;
	
	public Gutschein(double price, String gesch�ft, double wert) {
		super(price);
		this.gesch�ft = gesch�ft;
		this.wert = wert;
	}

	public String getGesch�ft() {
		return gesch�ft;
	}

	public void setGesch�ft(String gesch�ft) {
		this.gesch�ft = gesch�ft;
	}

	public double getValue() {
		return wert;
	}

	public void setValue(double value) {
		this.wert = value;
	}
	
	public void gutscheinEinl�sen(double betrag) {
		if(betrag > wert) {
			System.out.println("Error");
		}
		wert -= betrag;
	}

	@Override
	public String toString() {
		return "Gutschein [price=" + super.getPrice() + ", gesch�ft=" + gesch�ft + ", value=" + wert + "]";
	}
}
