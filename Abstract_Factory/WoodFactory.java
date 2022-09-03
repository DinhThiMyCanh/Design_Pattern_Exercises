package Abstract_Factory;

public class WoodFactory extends FunitureAbstractFactory{

	@Override
	public Chair CreateChair() {
		// TODO Auto-generated method stub
		return new WoodChair();
	}

	@Override
	public Table CreateTable() {
		// TODO Auto-generated method stub
		return new WoodTable();
	}

}
