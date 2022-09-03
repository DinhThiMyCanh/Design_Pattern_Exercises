package Builder;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder builer = new MealBuilder();
		
		Meal vegMeal = builer.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItem();
		System.out.println("Tong gia:" +vegMeal.getCost());
		
		Meal noVegMeal = builer.prepareNoVegMeal();
		System.out.println("------------------");
		System.out.println(" NoVeg Meal");
		noVegMeal.showItem();
		System.out.println("Tong gia:" +noVegMeal.getCost());
	}

}
