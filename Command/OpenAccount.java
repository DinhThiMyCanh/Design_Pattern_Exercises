package Command;

public class OpenAccount implements Command {
	private Account acoount;
	
	public OpenAccount(Account account) {
		this.acoount = account;
	}
	@Override
	public void excute() {
		acoount.open();
	}

}
