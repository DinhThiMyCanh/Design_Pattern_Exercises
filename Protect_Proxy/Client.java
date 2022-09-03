package Protect_Proxy;

public class Client {

	public static void main(String[] args) {
		UserService admin = new UserServiceProxy("Nam", "admin");
		admin.load();
		admin.insert();
		
		UserService customer = new UserServiceProxy("Nam", "customer");
		customer.load();
		customer.insert();
	}

}
