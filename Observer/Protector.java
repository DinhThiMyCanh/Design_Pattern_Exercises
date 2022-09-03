package Observer;

public class Protector implements Observer {

	@Override
	public void update(User user) {
		if (user.getStatus() ==loginStatus.INVALID)
			System.out.println("Protector: user "+user.getEmail()+",ip:"+user.getIP()+" is blocked");
	}

}
