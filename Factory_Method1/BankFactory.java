package Factory_Method1;

public class BankFactory {
	//Khai baìo private ğêÒ không khõÒi taòo ğôìi tıõòng BankFactory õÒ lõìp khaìc
	private BankFactory() {};
	//Phıõng thıìc Factory method traÒ vêÌ Product laÌ Bank
	//Khai baìo final ğêÒ không ghi ğeÌ
	public static final Bank getBank(BankType bankType) {
		switch (bankType) {
		case TPBank: {
			
			return new TPBank();
		}
		case VietComBank: {
			
			return new VietComBank();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + bankType);
		}
	}
	
	
}
