package Virtual_Proxy;

public class Client {

	public static void main(String[] args) {
		System.out.println("Init proxy Image");
		Image proxyImage = new ProxyImage("http://Tiki.com.vn");
		
		System.out.println("-----------");
		System.out.println("call real service 1st");
		proxyImage.showImage();
		
		System.out.println("-----------");
		System.out.println("call real service 2st");
		proxyImage.showImage();
		
		

	}

}
