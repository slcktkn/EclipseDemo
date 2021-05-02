
public class Course {
	
	private int id;
	private int userId;
	private int instructorId;
	private String courseName;
	
	public Course() {
		System.out.println("Course was requested");
	}

	public Course(int id, int userId, int instructorId, String courseName) {
		super();
		this.id = id;
		this.userId = userId;
		this.instructorId = instructorId;
		this.courseName = courseName;
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

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	
	

}
