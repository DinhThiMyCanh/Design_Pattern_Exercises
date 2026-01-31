package Abstract_Factory_SingLeton_DuckSimulator;

public class DuckFactoryProvider {
	 public static DuckFamilyFactory getFactory(DuckFamily family ) {
	        switch (family) {
	            case MALLARD:
	                return MallardFamilyFactory.getInstance();
	            case RUBBER:
	                return RubberFamilyFactory.getInstance();
	            default:
	                throw new IllegalArgumentException("Unknown family");
	        }
	    }
}
