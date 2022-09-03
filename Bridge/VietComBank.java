package Bridge;

public class VietComBank extends Bank {

	public VietComBank(Account account) {
		super(account);
	}

	@Override
	public void openAccount() {
		System.out.println("Mo tai khoan tai VietComBank");
		account.openAccount();
		
	}

}
