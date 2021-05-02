
public class CourseManager {
	
	public void addOperation (Runner runner, CorporateStudent corporateStudent ) {
		System.out.println("Added :"+corporateStudent.courseName);
		
			runner.add();

		
	}
	
	public void addStudent (CorporateStudent corporateStudent) {
		System.out.println("added :"+corporateStudent.courseName);
		
	}
	
	public void addMultiple (CorporateStudent[] corporateStudents) {
		for(CorporateStudent corporateStudent:corporateStudents) {
			System.out.println("added:"+corporateStudent);
		}
	}

}

