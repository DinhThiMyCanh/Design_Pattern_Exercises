package Factory_Method2;

public class Client {
	private static Dialog dialog;
	public static void main(String[] args) {
			//TuÌy thuôòc tham sôì truyêÌn vaÌo ğêÒ taòo ğôìi tıõòng
	        if (System.getProperty("os.name").equals("Windows 10")) {
	            dialog = new WindowsDialog();
	        } else {
	            dialog = new HTMLDialog();
	        }
	        dialog.renderWindow();
	    }
}
