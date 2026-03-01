package Bridge_Abstract_Factory;

public class TPBankFactory implements BankFactory {

	@Override
	public Bank createBank() {
		 Account account = new SavingAccount();     // chọn implementation phù hợp
	        return new TPBank(account);
	}

}
