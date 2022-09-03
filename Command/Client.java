package Command;



public class Client {

	public static void main(String[] args) {
		Account account = new Account("Minh");
		
		Command open = new OpenAccount(account);
		Command close = new CloseAccount(account);
		AppBank appBank = new AppBank(open, close);
		
		appBank.clickOpenAccount();
		appBank.clickCloseAccount();
		
	}

}
