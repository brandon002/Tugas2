package Currency;

public class USD {
	private double price;
	protected String symbol;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public USD(double price) {
		
		this.price = price;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol() {
		this.symbol = "$";
	}
	
}
