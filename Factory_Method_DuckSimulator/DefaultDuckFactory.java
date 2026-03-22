package Factory_Method_DuckSimulator;

//ConcreteCreator
public class DefaultDuckFactory extends DuckFactory {

	@Override
	public Duck createDuck(DuckType type) {
		// TODO Auto-generated method stub
		switch (type) {
        case MALLARD:
            return new MallarDuck();
        case RUBBER:
            return new RubberDuck();
        default:
            throw new IllegalArgumentException("Unknown duck type");
    }
	}

}

