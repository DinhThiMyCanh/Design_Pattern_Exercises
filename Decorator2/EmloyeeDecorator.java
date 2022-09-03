package Decorator2;

import java.util.Date;

public abstract class EmloyeeDecorator implements EmployeeComponent {
	protected EmployeeComponent employee;
	
	public EmloyeeDecorator(EmployeeComponent employee) {
		this.employee = employee;
	}
	@Override
	public String getName() {
		return employee.getName();
	}
	@Override
	public void join(Date joinDate) {
		employee.join(joinDate);
	}
	@Override
	public void terminate (Date terminateDate) {
		employee.terminate(terminateDate);
	}
}
