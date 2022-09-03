package State;

public class SubmittedState implements State{

	@Override
	public void handleRequire() {
		System.out.println("Submitted");	
	}

}
