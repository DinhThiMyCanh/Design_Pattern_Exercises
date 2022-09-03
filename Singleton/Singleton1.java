package Singleton;
//Cach 1: khởi tạo ngay instance = new Singleton
public class Singleton1 {
	private static Singleton1 instance = new Singleton1();
	
	private Singleton1() {}
	
	public static Singleton1 getIntance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.print("Xin chào");
	}
	
}
