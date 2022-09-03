package Template_Method;

public class Client {

	public static void main(String[] args) {
		PageTemplate page1 = new HomePage();
		page1.showPage();
		
		System.out.println("-------=");
		PageTemplate page2 = new DetailPage();
		page2.showPage();
		
		System.out.println("-------=");
		PageTemplate page3 = new ContactPage();
		page3.showPage();

	}

}
