package Decorator1;

public class MilkCoffee extends CoffeDecorator{

	public MilkCoffee(Coffee coffee) {
		super(coffee);
	}
	
	public int getPrice() {
		return super.getPrice()+ getMilkPrice();
	}
	
	public int getMilkPrice() {
		return 5000;
	}

}
