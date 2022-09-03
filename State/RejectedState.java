package State;

public class RejectedState implements State {

	@Override
	public void handleRequire() {
		System.out.println("Rejected");
	}

}
