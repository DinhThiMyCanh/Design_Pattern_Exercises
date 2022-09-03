package Builder;
//Ta�o ca�c ���i t���ng cho Meal
public class MealBuilder {
	
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Pepsi() );
		return meal;
	}
	
	public Meal prepareNoVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Coke() );
		return meal;
	}
}
