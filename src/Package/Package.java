package Package;

import Currency.USD;

import java.util.Vector;

import Component.Component;

public abstract class Package {
	
	protected String name;
	protected USD price;
	protected String packageName;
	protected int qty;
	protected Vector<Component> listComponent = new Vector<>();
	public Package(String name, USD price, Vector<Component> listComponent, int qty ) {
		this.name = name;
		this.price = price;
		this.listComponent = listComponent;
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public USD getPrice() {
		return price;
	}
	public void setPrice(USD price) {
		this.price = price;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	
	
//	public String viewPackage() {
//		
//	}
//	

}
