package odev3;

public class Student extends User{

	private String courseStatus;
	private String lectureStatus;
	
	public Student() {
		//Constructor
		
	}
	
	public String getCourseStatus() {
		return courseStatus;
	}
	
	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}
	public String getLectureStatus() {
		return lectureStatus;
	}
	public void setLectureStatus(String lectureStatus) {
		this.lectureStatus = lectureStatus;
	}
	
	
	
	
	
	
}
