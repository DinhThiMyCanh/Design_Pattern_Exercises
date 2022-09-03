package Decorator1;
//Khai ba�o Abstract vi� getPrice() co�n �i�nh nghi�a la�i

public abstract class CoffeDecorator implements Coffee {
	
	private Coffee coffee;
	public CoffeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	public int getPrice(){
		return coffee.getPrice();
	}
	
}
