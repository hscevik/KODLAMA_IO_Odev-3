package odev3;

public class InstructorManagement {
	
	public InstructorManagement() {
		
		//Constructor
		
	}
	
public void addInstructor(Instructor instructor) {
		
		System.out.println(instructor.getId()+" ID'li eğitmen sisteme eklenmiştir.");
		
	}

public void changeauthorization(Instructor instructor) {
	System.out.println(instructor.getId()+"ID'li eğitmenin yetkisi "+instructor.getAuthorizationId()+" Olarak değiştirilmitir.");
}

}
