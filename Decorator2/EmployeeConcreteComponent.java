package Decorator2;

import java.util.Date;

public class EmployeeConcreteComponent implements EmployeeComponent {
	private String name;
	
	public EmployeeConcreteComponent(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	@Override
	public void doTask() {
		// unassigning task
	}

	@Override
	public void join(Date joinDate) {
		System.out.println("Nhan vien:"+this.getName()+" join:"+joinDate);
		
	}

	@Override
	public void terminate(Date terminateDate) {
		System.out.println("Nhan vien:"+this.getName()+" terminate:"+terminateDate);
		
	}

}
