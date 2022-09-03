package Bridge;

public class Client {

	public static void main(String[] args) {
		//Quyêìt ğiònh haÌnh vi naÌo luìc thıòc thi
		Bank tpbank = new TPBank(new CheckingAccount());
		tpbank.openAccount();
		
		Bank vietcombank = new VietComBank(new SavingAccount());
		vietcombank.openAccount();
	}

}
