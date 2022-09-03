package Observer;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements Subject{
	private User user;
	private List<Observer> observers = new ArrayList<>();
	
	public AccountService(String email, String ip) {
		user = new User();
		user.setEmail(email);
		user.setIp(ip);
	}
	@Override
	public void attach(Observer observer) {
		if (!observers.contains(observer))
			observers.add(observer);
		
	}

	@Override
	public void detach(Observer observer) {
		if (observers.contains(observer))
			observers.remove(observer);
		
	}

	@Override
	public void notifyAllObserver() {
			for (Observer observer:observers)
				observer.update(user);
	}
	
	public void changeStatus(loginStatus status) {
		user.setStatus(status);
		System.out.println("Da thay doi trang thai");
		this.notifyAllObserver();
	}
	
	public void login() {
		if (!isValidIP()) {
			user.setStatus(loginStatus.INVALID);
		}
		else
			if (!isEmail()) {
				user.setStatus(loginStatus.FAILURE);
			}
			else
				user.setStatus(loginStatus.SUCCESS);
		System.out.println("Login is handled");
		this.notifyAllObserver();
	}
	
	private boolean isValidIP() {
		return "1.1.1.1".equals(user.getIP());
	}
	private boolean isEmail() {
		return "canhdhqn@gmail.com".equalsIgnoreCase(user.getEmail());
	}

}
