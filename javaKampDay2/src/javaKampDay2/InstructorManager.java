package javaKampDay2;

public class InstructorManager {
	public void joinCourse(Instructor instructor) 
	{
		System.out.println(instructor.firstName + " " + instructor.lastName + " adl� e�itmen kursa kat�ld�.");
	}
	
	public void leaveCourse(Instructor instructor) 
	{
		System.out.println(instructor.firstName + " " + instructor.lastName + " adl� e�itmen kurstan ayr�ld�.");
	}
}
