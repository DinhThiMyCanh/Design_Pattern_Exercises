package DuckSimulator;

public class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {}
	
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior =qb;
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void display() {
		System.out.println("Toi la Duck");
	}
	public void swim() {
		System.out.println("Toi boi duoc");
	}
	
}
