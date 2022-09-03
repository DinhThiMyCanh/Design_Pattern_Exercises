package Decorator1;

public class IceCream extends CoffeDecorator{

	public IceCream(Coffee coffee) {
		super(coffee);
	}
	public int getPrice() {
		return super.getPrice()+ getIceCreamPrice();
	}
	
	public int getIceCreamPrice() {
		return 5000;
	}


}
