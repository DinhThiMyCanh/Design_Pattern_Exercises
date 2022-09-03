package Factory_Method2;

public class Client {
	private static Dialog dialog;
	public static void main(String[] args) {
			//Tu�y thu��c tham s�� truy��n va�o ��� ta�o ���i t���ng
	        if (System.getProperty("os.name").equals("Windows 10")) {
	            dialog = new WindowsDialog();
	        } else {
	            dialog = new HTMLDialog();
	        }
	        dialog.renderWindow();
	    }
}
