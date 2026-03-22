package DuckSimulator;

public class DuckFactory {
	private DuckFactory() {}
	
	public static final Duck getDuck(String typeDuck) {
		switch (typeDuck) {
			case "MallarDuck":
				return new MallarDuck();
			case "RubberDuck":
				return new RubberDuck();
			default:
				return null;
		}
	}
}
