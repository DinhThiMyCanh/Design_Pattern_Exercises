package Factory_Method1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vi� getBank tra� v�� Bank (Product)
		BankFactory factory = new DefaultBankFactory();
		System.out.print(factory.creatBank(BankType.TPBank).getName());
		
	}

}
