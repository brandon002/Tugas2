package Component;

import Currency.USD;

public class Component {
	private String componentName;
	private USD currency;
	public Component(String componentName, double price) {
		this.componentName = componentName;
		this.currency = new USD(price);
	}
	public String getComponentName() {
		return componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	public USD getCurrency() {
		return currency;
	}
	public void setCurrency(USD currency) {
		this.currency = currency;
	}
	
}
