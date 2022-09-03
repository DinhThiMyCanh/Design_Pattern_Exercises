package Abstract_Factory;

public class PlasticFactory extends FunitureAbstractFactory {

	@Override
	public Chair CreateChair() {
		// TODO Auto-generated method stub
		return new PlasticChair();
	}

	@Override
	public Table CreateTable() {
		// TODO Auto-generated method stub
		return new PlasticTable();
	}

}
