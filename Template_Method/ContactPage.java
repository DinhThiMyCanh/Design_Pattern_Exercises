package Template_Method;

public class ContactPage extends PageTemplate {

	@Override
	protected void showNavigation() {
		//no dothing
	}
	@Override
	protected void showBody() {
		System.out.println("content of contact page");
		
	}
	

}
