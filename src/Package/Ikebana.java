package Package;

import java.util.Vector;

import Component.Component;
import Currency.USD;

public class Ikebana extends Package{

	public Ikebana(String name, USD price, Vector<Component> listComponent, int qty) {
		super(name, price, listComponent, qty);
		this.packageName = "Ikebana";
	}

	
}
