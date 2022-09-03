package Singleton;


public class Demo_Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Run Cách 3
		Thread Thread1 = new Thread (new Thread1());
		Thread Thread2 = new Thread (new Thread2());
		Thread1.start();
		Thread2.start();
		 
	}
	
	static class Thread1 implements Runnable {
		@Override
		public void run() {
			Singleton3 object = Singleton3.getInstance("Foo");
			object.showMessage();
			
		}
	}
	
	static class Thread2 implements Runnable {
		@Override
		public void run() {
			Singleton3 object = Singleton3.getInstance("Bar");
			object.showMessage();
			
		}
	}

}
