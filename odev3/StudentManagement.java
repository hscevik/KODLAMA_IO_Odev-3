package odev3;

public class StudentManagement {

public StudentManagement() {
	
	
}

	public void takeTheCourse(Student student) {
		
		System.out.println(student.getId()+"ID'li ��renci taraf�ndan "+student.getCourseId()+" ID'li kursa kat�l�m sa�lanm��t�r.");
	}
	public void takeTheLecture(Student student) {
		
		System.out.println(student.getId()+"ID'li ��renci taraf�ndan "+student.getCourseId()+" ID'li derse kat�l�m sa�lanm��t�r.");
	}
	
	public void setCourseStatus(Student student) {
		
		System.out.println(student.getId()+"ID'li ��rencinin "+student.getCourseId()+" ID'li kursu "+student.getCourseStatus());
		
	}
	
	
}
