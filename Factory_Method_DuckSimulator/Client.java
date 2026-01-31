package Factory_Method_DuckSimulator;

import java.util.LinkedList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Duck> ducks = new LinkedList<Duck>();
		
		DuckFactory factory = new DefaultDuckFactory();
        Duck duck1 = factory.createDuck(DuckType.MALLARD);
        Duck duck2 = factory.createDuck(DuckType.RUBBER);
        
       // Chỉ tạo Duck → Factory Method
	
		ducks.add(duck1);
		ducks.add(duck2);
		
		processDucks(ducks);
		
		//Co the thay doi hanh vi dong
		duck2.setFlyBehavior(new FlyWithWings());
		duck2.setQuackBehavior(new Silence());
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
