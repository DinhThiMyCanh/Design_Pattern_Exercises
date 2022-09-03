package Abstract_Factory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunitureAbstractFactory factory = FunitureFactory.getFactory(MaterialType.PLASTIC);
		
		Chair chair = factory.CreateChair();
		chair.create();
		Table table = factory.CreateTable();
		table.create();

	}

}
