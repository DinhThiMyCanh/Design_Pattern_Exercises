package Singleton;
//Cách 2: Chỉ tạo instance ở lần chạy đầu tiên
public class Singleton2 {
	private static Singleton2 instance = null;
	
	private String name;
	private Singleton2(String name) {
		//Mô phỏng quá trình khởi tạo chậm
		/*try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }*/
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
