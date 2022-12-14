package Iterator;

import java.util.ArrayList;
import java.util.List;
//Class trong class
public class Menu {
	private List<Item> menuItems = new ArrayList<>();
	
	public void addItem(Item item) {
		menuItems.add(item);
	}
	
	public ItemIterator<Item> iterator(){
		return new MenuItemIterator();
	}
	
	public class MenuItemIterator implements ItemIterator<Item>{
		private int currentIndex =0;
		@Override
		public boolean hasNext() {
			return currentIndex< menuItems.size();
		}

		@Override
		public Item next() {
			return menuItems.get(currentIndex++);
		}

	}
	
}
