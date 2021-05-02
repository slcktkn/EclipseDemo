
public class BaseStudent {
	
	private int userId;
	private String courseName;
	
	
	public BaseStudent() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BaseStudent(int userId, String courseName) {
		super();
		this.userId = userId;
		this.courseName = courseName;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
