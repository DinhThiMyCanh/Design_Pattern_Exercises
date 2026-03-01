package Prototype_1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student s1 = new Student("SV01", "An", 3.5);

	        // Clone
	        Student s2 = s1.clone();

	        s2.setName("Binh");

	        System.out.println("Original: " + s1);
	        System.out.println("Clone   : " + s2);
	}

}
