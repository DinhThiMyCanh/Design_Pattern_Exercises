package Singleton;
//Cách 2: Chỉ tạo instance ở lần chạy đầu tiên
public class Singleton2 {
	private static Singleton2 instance = null;
	
	private String name;
	private Singleton2(String name) {
		this.name = name;}
	
	public static Singleton2 getInstance(String name) {
		
		if (instance == null)
		{
			instance = new Singleton2(name);
		}
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Xin chào "+this.name);
	}

}
