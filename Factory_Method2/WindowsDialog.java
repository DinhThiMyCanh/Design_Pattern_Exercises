package Factory_Method2;
//One more concrete creator
public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

}
