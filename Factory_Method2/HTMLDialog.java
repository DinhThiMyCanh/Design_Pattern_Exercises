package Factory_Method2;
//Concrete creator
public class HTMLDialog extends Dialog {
	public Button createButton() {
        return new HTMLButton();
    }

}
