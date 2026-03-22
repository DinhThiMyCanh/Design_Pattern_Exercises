package Factory_Method1;

public class DefaultBankFactory extends BankFactory {
	@Override
	public Bank creatBank(BankType bankType) {
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
