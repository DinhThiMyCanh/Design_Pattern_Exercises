package Decorator1;
//Khai baìo Abstract viÌ getPrice() coÌn ðiònh nghiÞa laòi

public abstract class CoffeDecorator implements Coffee {
	
	private Coffee coffee;
	public CoffeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	public int getPrice(){
		return coffee.getPrice();
	}
	
}
