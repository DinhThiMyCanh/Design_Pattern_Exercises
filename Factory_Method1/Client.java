package Factory_Method1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vi� getBank tra� v�� Bank (Product)
		Bank bank = BankFactory.getBank(BankType.TPBank);
		System.out.print(bank.getName());
		
	}

}
