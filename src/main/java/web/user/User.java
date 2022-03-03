package web.user;

public class User {
	private String userName;
	private String password;
	private boolean isAdmin;
	
	public User(String userName, String password, boolean isAdmin) {
		super();
		this.userName = userName;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public boolean getIsAdmin() {
		return isAdmin;
	}
}
