package Adapter;

import Currency.USD;
public class USDtoEUR extends USD{
	private USD currencyUSD;
	
	public USDtoEUR(double price, USD currencyUSD) {
		super(price);
		this.symbol = "EUR";
		this.currencyUSD = currencyUSD;
	}
	
	public String getPriceSymbol() {
		return currencyUSD.getPrice()*0.8 + " "+ this.symbol;
	}

}
