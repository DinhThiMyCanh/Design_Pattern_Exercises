package Abstract_Factory_Method_DuckSimulator;

public class MallarDuck extends Duck{
	public MallarDuck() {
		flyBehavior  = new FlyWithWings();
		quackBehavior = new Silence();
	}
	
	public void display() {
		System.out.println("Toi la MallarDuck");
	}
}
