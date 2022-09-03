package Decorator2;

public class TeamLeader extends EmloyeeDecorator{

	public TeamLeader(EmployeeComponent employee) {
		super(employee);
	}
	public void planning() {
		System.out.println(super.getName()+" is planning");
	}
	public void motivate() { 
		System.out.println(super.getName()+" is motivating");
	}
	public void monitor() {
		System.out.println(super.getName()+" is monitoring");
	}
	@Override
	public void doTask() {
		employee.doTask();
		planning();
		motivate();
		monitor();
	}

}
