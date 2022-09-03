package Protect_Proxy;

public class UserServiceIml implements UserService {
	private String name;
	
	public UserServiceIml(String name) {
		this.name = name;
	}
	@Override
	public void load() {
		System.out.println(name +" loaded");
		
	}

	@Override
	public void insert() {
		System.out.println(name + " inserted");
		
	}

}
