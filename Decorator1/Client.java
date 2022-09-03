package Decorator1;

public class Client {

	public static void main(String[] args) {
		Coffee coffee = new MilkCoffee(new IceCream(new DefaultCoffee()));
		System.out.println("Coffe Milk IceCream:"+coffee.getPrice());

		Coffee coffee1 = new MilkCoffee(new DefaultCoffee());
		System.out.println("Coffe Milk:"+coffee1.getPrice());
	}

}
