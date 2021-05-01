package odev3;

public class StudentManagement {

public StudentManagement() {
	
	
}

	public void takeTheCourse(Student student) {
		
		System.out.println(student.getId()+"ID'li öğrenci tarafından "+student.getCourseId()+" ID'li kursa katılım sağlanmıştır.");
	}
	public void takeTheLecture(Student student) {
		
		System.out.println(student.getId()+"ID'li öğrenci tarafından "+student.getCourseId()+" ID'li derse katılım sağlanmıştır.");
	}
	
	public void setCourseStatus(Student student) {
		
		System.out.println(student.getId()+"ID'li öğrencinin "+student.getCourseId()+" ID'li kursu "+student.getCourseStatus());
		
	}
	
	
}
