package Protect_Proxy;

public class UserServiceProxy implements UserService {
	private UserServiceIml userServiceIml;
	private String role;
	
	public UserServiceProxy(String name, String role) {
		this.userServiceIml = new UserServiceIml(name);
		this.role = role;
	}

	@Override
	public void load() {
		userServiceIml.load();
		
	}

	@Override
	public void insert() {
		if (isAdmin()) {
			userServiceIml.insert();
		}
		else
			System.out.println("Access denied");
		
	}
	
	public boolean isAdmin() {
		return "admin".equalsIgnoreCase(this.role);
	}

}
