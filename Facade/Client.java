package Facade;

public class Client {

	public static void main(String[] args) {
		ShopFacade.getINSTANCE().buyProductFreeShip("canhdhqn@gmail.com");
		System.out.println("------------------");
		ShopFacade.getINSTANCE().buyProductExpress("canhdhqn@gmail.com","Samsung");

	}

}
