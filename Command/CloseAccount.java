package Command;

public class CloseAccount implements Command{

	private Account acoount;
	
	public CloseAccount(Account account) {
		this.acoount = account;
	}
	@Override
	public void excute() {
		acoount.close();
	}


}
