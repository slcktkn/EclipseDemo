
public class User {
	private int id;
	private int userId;
	private String userName;
	private byte[] passwordHash;
	private byte[] passwordSalt;
	private String email;
	private boolean status;
	
	public User() {
		System.out.println("User was requested");
	}
	public User(int id, int userId, String userName, byte[] passwordHash, byte[] passwordSalt, String email, boolean status) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.passwordHash = passwordHash;
		this.passwordSalt = passwordSalt;
		this.email = email;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public byte[] getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(byte[] passwordHash) {
		this.passwordHash = passwordHash;
	}
	public byte[] getPasswordSalt() {
		return passwordSalt;
	}
	public void setPasswordSalt(byte[] passwordSalt) {
		this.passwordSalt = passwordSalt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Boolean getStatus() {
		return status;
	}
	
	

}
