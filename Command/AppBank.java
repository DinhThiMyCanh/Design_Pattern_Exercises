package Command;

public class AppBank {
	private Command openAccount;
	private Command closeAccount;
	
	public AppBank(Command openCommand, Command closeAccount) {
		this.openAccount = openCommand;
		this.closeAccount = closeAccount;
	}
	
	public void clickOpenAccount() {
		openAccount.excute();
	}
	public void clickCloseAccount() {
		closeAccount.excute();
	}

}
