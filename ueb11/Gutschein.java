package ueb11;

public class Gutschein extends Geschenk {
	
	private double price;
	private String geschäft;
	private double wert;
	
	public Gutschein(double price, String geschäft, double wert) {
		super(price);
		this.geschäft = geschäft;
		this.wert = wert;
	}

	public String getGeschäft() {
		return geschäft;
	}

	public void setGeschäft(String geschäft) {
		this.geschäft = geschäft;
	}

	public double getValue() {
		return wert;
	}

	public void setValue(double value) {
		this.wert = value;
	}
	
	public void gutscheinEinlösen(double betrag) {
		if(betrag > wert) {
			System.out.println("Error");
		}
		wert -= betrag;
	}

	@Override
	public String toString() {
		return "Gutschein [price=" + super.getPrice() + ", geschäft=" + geschäft + ", value=" + wert + "]";
	}
}
