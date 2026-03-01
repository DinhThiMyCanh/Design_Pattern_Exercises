package Prototype_2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Tạo cấu hình chuẩn
        Computer standardConfig =
                new Computer(
                        "Windows 11",
                        "MS Office 365",
                        "Kaspersky",
                        "Google Chrome"
                );

        standardConfig.addSoftware("Zoom");

        System.out.println("=== Standard Configuration ===");
        System.out.println(standardConfig);

        // Clone cho nhân viên 1
        Computer employee1 = standardConfig.clone();
        employee1.addSoftware("Photoshop");

        // Clone cho nhân viên 2
        Computer employee2 = standardConfig.clone();
        employee2.addSoftware("IntelliJ IDEA");

        System.out.println("=== Employee 1 Computer ===");
        System.out.println(employee1);

        System.out.println("=== Employee 2 Computer ===");
        System.out.println(employee2);
	}

}
