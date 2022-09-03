package Decorator2;

public class TeamMember extends EmloyeeDecorator {

	public TeamMember(EmployeeComponent employee) {
		super(employee);
	}
	
	public void reportTask() {
		System.out.println(super.getName()+" is reporting");
	}
	
	public void coordinateWithOthers() {
		System.out.println(super.getName()+" is coordinating");
	}

	@Override
	public void doTask() {
		employee.doTask();
		reportTask();
		coordinateWithOthers();
	}
}
