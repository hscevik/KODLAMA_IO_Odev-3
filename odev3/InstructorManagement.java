package odev3;

public class InstructorManagement {
	
	public InstructorManagement() {
		
		//Constructor
		
	}
	
public void addInstructor(Instructor instructor) {
		
		System.out.println(instructor.getId()+" ID'li e�itmen sisteme eklenmi�tir.");
		
	}

public void changeauthorization(Instructor instructor) {
	System.out.println(instructor.getId()+"ID'li e�itmenin yetkisi "+instructor.getAuthorizationId()+" Olarak de�i�tirilmitir.");
}

}
