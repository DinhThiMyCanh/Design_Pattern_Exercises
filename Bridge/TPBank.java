package Bridge;

public class TPBank extends Bank{

	public TPBank(Account account) {
		super(account);
		// TODO Auto-generated constructor stub
	}
	public void openAccount() {
		System.out.println("Mo tai khoan tai TPBank");
		account.openAccount();
	}
	
	

}
