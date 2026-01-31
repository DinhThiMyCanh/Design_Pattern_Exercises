package Abstract_Factory_SingLeton_DuckSimulator;

import java.util.LinkedList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Duck> ducks = new LinkedList<Duck>();
		
		DuckFamilyFactory factory = DuckFactoryProvider.getFactory(DuckFamily.MALLARD);
		Duck duck = factory.createDuck();
		duck.setFlyBehavior(factory.createFly());
		duck.setQuackBehavior(factory.createQuack());
        
       // tạo cả họ hành vi: Duck + Fly + Quack
	
		ducks.add(duck);
	
		
		processDucks(ducks);
		
		//Co the thay doi hanh vi dong
		duck.setFlyBehavior(new CanFly());
		duck.setQuackBehavior(new Silence());
		processDucks(ducks);
	}
	public static void processDucks(List<Duck>ducks) {
		for (Duck d:ducks) {
			System.out.println("----------------------");
			d.display();
			d.swim();
			d.performFly();
			d.performQuack();
			
		}
			
		
	}
}
