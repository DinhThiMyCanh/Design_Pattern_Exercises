package Abstract_Factory_SingLeton_DuckSimulator;

//Concrete Factories
public class RubberFamilyFactory implements DuckFamilyFactory{
	private static RubberFamilyFactory instance;

    private RubberFamilyFactory() {}

    public static RubberFamilyFactory getInstance() {
        if (instance == null) {
            instance = new RubberFamilyFactory();
        }
        return instance;
    }
	public Duck createDuck() { return new RubberDuck(); }
    public FlyBehavior createFly() { return new CanFly(); }
    public QuackBehavior createQuack() { return new Silence(); }
}
