package Abstract_Factory_SingLeton_DuckSimulator;

//Concrete Factories
public class MallardFamilyFactory implements DuckFamilyFactory {
	private static MallardFamilyFactory instance;

    private MallardFamilyFactory() {}

    public static MallardFamilyFactory getInstance() {
        if (instance == null) {
            instance = new MallardFamilyFactory();
        }
        return instance;
    }
	public Duck createDuck() { return new MallarDuck(); }
    public FlyBehavior createFly() { return new FlyWithWings(); }
    public QuackBehavior createQuack() { return new Squeak(); }
}
