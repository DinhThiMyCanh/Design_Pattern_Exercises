package Abstract_Factory_Method_DuckSimulator;

public class DuckFactoryProvider {
	 public static DuckFamilyFactory getFactory(DuckFamily family ) {
	        switch (family) {
	            case MALLARD:
	                return new MallardFamilyFactory();
	            case RUBBER:
	                return new RubberFamilyFactory();
	            default:
	                throw new IllegalArgumentException("Unknown family");
	        }
	    }
}
