package odev3;

public class InstructorManagement {
	
	public InstructorManagement() {
		
		//Constructor
		
	}
	
public void addInstructor(Instructor instructor) {
		
		System.out.println(instructor.getId()+" ID'li eðitmen sisteme eklenmiþtir.");
		
	}

public void changeauthorization(Instructor instructor) {
	System.out.println(instructor.getId()+"ID'li eðitmenin yetkisi "+instructor.getAuthorizationId()+" Olarak deðiþtirilmitir.");
}

}
