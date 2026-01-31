package Abstract_Factory_Method_DuckSimulator;

//Concrete Factories
public class RubberFamilyFactory implements DuckFamilyFactory{
	public Duck createDuck() { return new RubberDuck(); }
    public FlyBehavior createFly() { return new CanFly(); }
    public QuackBehavior createQuack() { return new Silence(); }
}
