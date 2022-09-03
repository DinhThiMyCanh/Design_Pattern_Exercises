package Bridge;

public class Client {

	public static void main(String[] args) {
		//Quy��t �i�nh ha�nh vi na�o lu�c th��c thi
		Bank tpbank = new TPBank(new CheckingAccount());
		tpbank.openAccount();
		
		Bank vietcombank = new VietComBank(new SavingAccount());
		vietcombank.openAccount();
	}

}
