package Bridge_Abstract_Factory;

import Factory_Method1.BankType;

public class Client {

	public static void main(String[] args) {
		
		BankFactory factory1 = new TPBankFactory();
        Bank tpBank = factory1.createBank();
        tpBank.openAccount();

        BankFactory factory2 = new VietcomBankFactory();
        Bank vietcom = factory2.createBank();
        vietcom.openAccount();
	}

}
