package Command;

public class Account {
	private String name;
	
	public Account(String name) {
		this.name = name;
	}
	public void open() {
		System.out.println("Name:"+name+" open Account");
	}
	public void close() {
		System.out.println("Name:"+name+" close Account");
	}

}
