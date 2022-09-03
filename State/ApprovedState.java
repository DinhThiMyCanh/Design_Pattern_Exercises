package State;

public class ApprovedState implements State{

	@Override
	public void handleRequire() {
		System.out.println("Approved");
		
	}

}
