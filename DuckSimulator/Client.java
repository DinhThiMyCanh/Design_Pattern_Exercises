package DuckSimulator;

import java.util.LinkedList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Duck> ducks = new LinkedList<Duck>();
		//Tat ca co Kieu lop cha supertype
		Duck myDuck = new RubberDuck();
		ducks.add(new MallarDuck());
		ducks.add(myDuck);
		
		processDucks(ducks);
		
		//Co the thay doi hanh vi dong
		myDuck.setFlyBehavior(new FlyWithWings());
		myDuck.setQuackBehavior(new Silence());
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
