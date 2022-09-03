package Observer;

public class Mailer implements Observer {

	@Override
	public void update(User user) {
		if (user.getStatus() == loginStatus.EXPIRED)
		System.out.println("Email: user "+user.getEmail() +"expired");
		
	}

}
