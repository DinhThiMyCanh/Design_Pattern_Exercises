package Observer;

public class Client {

	public static void main(String[] args) {
		AccountService account1 = createAccount("canhdhqn@gmail.com","1.1.1.1");
		account1.login();
		account1.changeStatus(loginStatus.EXPIRED);
		
		System.out.println("---------");
		AccountService account2 = createAccount("canhdhqn@gmail.com","1.1.2.3");
		account2.login();
	}
	
	private static AccountService createAccount(String email, String ip) {
		AccountService account = new AccountService(email, ip);
		account.attach(new Logger());
		account.attach(new Mailer());
		account.attach(new Protector());
		return account;
		
	}

}
