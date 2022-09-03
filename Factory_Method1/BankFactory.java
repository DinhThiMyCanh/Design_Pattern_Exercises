package Factory_Method1;

public class BankFactory {
	//Khai ba�o private ��� kh�ng kh��i ta�o ���i t���ng BankFactory �� l��p kha�c
	private BankFactory() {};
	//Ph��ng th��c Factory method tra� v�� Product la� Bank
	//Khai ba�o final ��� kh�ng ghi �e�
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
