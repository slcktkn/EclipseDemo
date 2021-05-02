
public class CorporateStudent {
	
	int id;
	int userId;	
	String companyName;
	String taskNumber;
	String courseName;
	
	public CorporateStudent() {
		System.out.println("CorporateStudent was requested");
	}

	public CorporateStudent(int id, int userId,  String companyName, String taskNumber, String courseName) {
		super();
		this.id = id;
		this.userId = userId;
		this.companyName = companyName;
		this.taskNumber = taskNumber;
		this.courseName = courseName;
	}

}
