package Strategy;

public class Client {

	public static void main(String[] args) {
		SortList sortlist = new SortList();
		sortlist.add("Java core");
		sortlist.add("Java Design pattern");
		sortlist.add("Java library");
		sortlist.add("Java Framework");
		
		sortlist.setSortStrategy(new QuickSort());
		sortlist.sort();
		
		sortlist.setSortStrategy(new SelectionSort());
		sortlist.sort();

	}

}
