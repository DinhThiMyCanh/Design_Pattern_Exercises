package Decorator2;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		System.out.println("Nhan vien binh thuong");
		EmployeeComponent employee = new EmployeeConcreteComponent("Anh");
		employee.showInformation();
		employee.doTask();
		
		System.out.println("Team Leader");
		EmployeeComponent teamLeader =new TeamLeader(employee);
		teamLeader.showInformation();
		teamLeader.doTask();
		
		System.out.println("Manager");
		EmployeeComponent manager = new Manager(employee);
		manager.showInformation();
		manager.doTask();
		
		System.out.println("Team Leader and Manager");
		EmployeeComponent leaderAndManager = new Manager(new TeamLeader(employee));
		leaderAndManager.doTask();
		
	}

}
