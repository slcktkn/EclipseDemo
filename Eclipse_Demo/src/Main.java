
public class Main {

	public static void main(String[] args) {
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.addOperation(new CorporateStudentRunner(), new CorporateStudent(1,2,"Turkcell","1234567890","Twitter"));
		
		CorporateStudent corporateStudent1 = new CorporateStudent(1,2,"Turkcell","1234567890","Kodlamaio");
		CorporateStudent corporateStudent2 = new CorporateStudent(1,2,"Vodafone","1234567890","Youtube");
		CorporateStudent corporateStudent3 = new CorporateStudent(1,2,"TurkTelekom","1234567890","Udemy");
		
		courseManager.addStudent(corporateStudent1);
		courseManager.addStudent(corporateStudent2);
		courseManager.addStudent(corporateStudent3);

	}

}
