package Adapter;

import Currency.USD;
public class USDtoDOGE extends USD{
	private USD currencyUSD;
	
	public USDtoDOGE(double price, USD currencyUSD) {
		super(price);
		this.symbol = "DOGE";
		this.currencyUSD = currencyUSD;
	}
	
	public String getPriceSymbol() {
		return currencyUSD.getPrice()*3 + " "+ this.symbol;
	}

}
