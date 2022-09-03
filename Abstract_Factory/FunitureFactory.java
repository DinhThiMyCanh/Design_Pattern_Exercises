package Abstract_Factory;

public class FunitureFactory {
	private FunitureFactory() {};
	public static FunitureAbstractFactory getFactory(MaterialType materialType) {
		switch (materialType) {
		case PLASTIC: {
			return new PlasticFactory();
		}
		case WOOD: {
			return new WoodFactory();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + materialType);
		}
	}
}
