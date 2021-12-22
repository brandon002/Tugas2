package Factory;

import Package.Package;
import Currency.USD;

import java.util.Vector;

import Component.Component;

public abstract class PackageFactory {

	public PackageFactory() {
		// TODO Auto-generated constructor stub
	}
	public Package choosePackage(String name, USD price, Vector<Component> listComponent, int qty) {
		Package Package = createPackage(name,price,listComponent, qty);
		return Package;
	}
	
	
	
	protected abstract Package createPackage(String name, USD price, Vector<Component> listComponent, int qty);
}
