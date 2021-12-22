package Factory;

import java.util.Vector;

import Component.Component;
import Currency.USD;
import Package.Ikekabe;
import Package.Package;

public class IkebanaFactory extends PackageFactory{
	
	public IkebanaFactory() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	protected Package createPackage(String name, USD price, Vector<Component> listComponent, int qty) {
		// TODO Auto-generated method stub
		return new Ikekabe(name, price, listComponent, qty);
	}
	
	
}
