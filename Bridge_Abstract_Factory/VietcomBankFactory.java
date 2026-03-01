package Bridge_Abstract_Factory;

public class VietcomBankFactory implements BankFactory{

	@Override
	public Bank createBank() {
		Account account = new CheckingAccount();   // chọn implementation phù hợp
        return new VietComBank(account);
	}

}
