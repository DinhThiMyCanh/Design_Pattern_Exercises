package Observer;

public class User {
	private String email;
	private String ip;
	private loginStatus status;
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public void setStatus(loginStatus status) {
		this.status = status;
	}
	public String getIP() {
		return ip;
	}
	public String getEmail() {
		return email;
	}
	public loginStatus getStatus() {
		return status;
	}
}
