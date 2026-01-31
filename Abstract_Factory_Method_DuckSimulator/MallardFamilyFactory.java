package Abstract_Factory_Method_DuckSimulator;

//Concrete Factories
public class MallardFamilyFactory implements DuckFamilyFactory {
	public Duck createDuck() { return new MallarDuck(); }
    public FlyBehavior createFly() { return new FlyWithWings(); }
    public QuackBehavior createQuack() { return new Squeak(); }
}
