package Decorator2;

import java.util.Date;

public interface EmployeeComponent {
	String getName();
	void doTask();
	void join(Date joinDate);
	void terminate (Date terminateDate);
	default void showInformation() {
		System.out.println("--------------");
		System.out.println("Information:"+getName());
		join(new Date("12/6/2007"));
		terminate(new Date("30/6/2010"));
	}
}
