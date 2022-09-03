package Singleton;
//Cách 3: Trường hợp cùng lúc nhiều luồng truy cập đến đối tượng Singleton
//dẫn đến DeadLock (nghẽn)Thread-safe Singleton with lazy loading
public class Singleton3 {
	private static volatile Singleton3 instance;
	private String value;
	
	private Singleton3(String value) {
		this.value = value;}
	
	public static Singleton3 getInstance(String value) {
		if(instance == null){
	        synchronized (Singleton3.class) {
	            if(instance == null){
	                instance = new Singleton3(value);
	            }
	        }
	    }
	    return instance;
	}
	
	public void showMessage() {
		System.out.println("Xin chào " +this.value);
	}
}
