package instance;

public class Ex1 {

	public static void main(String[] args) {
		Student student = new Student();
		
		student.studentID = 1001;
		student.studentName = "박상민";
		student.grade = 2;
		student.address = "인천";
		
		student.showStudentInfo();
	}

}
