package Abstract_Factory_SingLeton_DuckSimulator;

//Abstract factory-tạo cả họ hành vi: Duck + Fly + Quack
public interface DuckFamilyFactory {
	Duck createDuck();
    FlyBehavior createFly();
    QuackBehavior createQuack();
}
