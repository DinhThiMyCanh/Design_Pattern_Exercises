package Iterator;

public class Client {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.addItem(new Item("New","/Home"));
		menu.addItem(new Item("Open","/Home"));
		menu.addItem(new Item("Cut","/Edit"));
		
		ItemIterator<Item> iterator = menu.iterator();
		while (iterator.hasNext()) {
			Item item = iterator.next();
			System.out.println(item);
		}

	}

}
