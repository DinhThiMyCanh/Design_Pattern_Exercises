package Decorator2;

public class Manager extends EmloyeeDecorator {

	public Manager(EmployeeComponent employee) {
		super(employee);
	}
	
	public void creatRequirement() {
		System.out.println(super.getName()+"is reate requirement");
	}
	
	public void assignTask() {
		System.out.println(super.getName()+"is assigning Task");
	}
	
	public void manageTask() {
		System.out.println(super.getName()+"is managing Task");
	}

	@Override
	public void doTask() {
		employee.doTask();
		creatRequirement();
		assignTask();
		manageTask();
	}
	

}
