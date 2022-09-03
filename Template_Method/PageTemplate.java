package Template_Method;

public abstract class PageTemplate {
	protected void showHeader() {
		System.out.println("<Header/>");
	}
	
	protected void showNavigation() {
		System.out.println("<navigation/>");
	}
	
	protected void showFooter() {
		System.out.println("<footer/>");
	}
	protected abstract void showBody();
	
	public final void showPage() {
		showHeader();
		showBody();
		showFooter();
		showNavigation();
	}

}
