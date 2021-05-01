package odev3;



public class Main {

	public static void main(String[] args) {
		// User
		
				User user1=new User();	
				user1.setId(1);
				user1.setFirstName("Harun Sertaç");
				user1.setLastName("ÇEVÝK");
				user1.setAdres("Ankara");
				user1.setMailAdress("hscevik@hotmail.com");
				user1.setUserName("hscevik");
				user1.setPassword("123456");
				user1.setProfilePicture("/profiles"+user1.getId()+".jpg");
				user1.setLectureId(0);
				user1.setCourseId(0);

				UserManagement userManagement=new UserManagement();
				userManagement.registerUser(user1);
				user1.setFirstName("Harun");
				userManagement.updateUser(user1);
				
				// Student
				
				Student student1=new Student();
				student1.setId(1);
				student1.setCourseId(1);
		        StudentManagement studentManagement=new StudentManagement();
		        studentManagement.takeTheCourse(student1);
				student1.setId(2);
		        student1.setLectureId(1);        
		        studentManagement.takeTheLecture(student1);
				student1.setId(3);
				student1.setCourseId(2);
				student1.setCourseStatus("Devam Ediyor.");
				studentManagement.setCourseStatus(student1);
				
				//Instructor
				
				
		        Instructor instructor1=new Instructor();
		        instructor1.setId(1);
		        instructor1.setFirstName("Engin");
		        instructor1.setLastName("DEMÝROÐ");
		        instructor1.setAdres("Ankara");
		        instructor1.setMailAdress("engindemirog@gmail.com");
		        instructor1.setUserName("engindemirog");
		        instructor1.setPassword("123456");
		        instructor1.setProfilePicture("/profiles"+instructor1.getId()+".jpg");
		        instructor1.setLectureId(0);
		        instructor1.setCourseId(0);
		        instructor1.setAuthorizationId(1);
		        
		        InstructorManagement instructorManagement=new InstructorManagement();
		        instructorManagement.addInstructor(instructor1);
		        
		        instructor1.setAuthorizationId(2);
		        instructorManagement.changeauthorization(instructor1);


	}

}
