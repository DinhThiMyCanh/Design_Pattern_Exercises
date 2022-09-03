package DuckSimulator;

public class RubberDuck extends Duck {
	public RubberDuck() {
		flyBehavior  = new CanFly();
		quackBehavior = new Squeak();
	}
	public void display() {
		System.out.println("Toi la RubberDuck");
	}
}
