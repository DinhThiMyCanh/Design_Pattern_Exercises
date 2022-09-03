package Builder;
import java.util.*;
public class Meal {
	 private List<Item> items = new ArrayList<Item>();
	 
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float sum=0.0f;
		for (Item item : items) {
			sum += item.price();
		}
		return sum;	
	}
	
	public void showItem() {
		for (Item item : items) {
			System.out.println("Item: "+item.name());
			System.out.println("Packing:"+item.packing().pack());
			System.out.println("Price:"+item.price());
		}
	}

}
