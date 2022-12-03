package core.validate;

import entities.Course;

public class CourseValidator {
	
	private Course[] courses;

	public CourseValidator(Course[] course) {
		super();
		this.courses = courses;
	}
	
	public boolean isValid(Course course)throws Exception{
		for(Course courses : courses) {
			
			if (courses.getCourseName()==course.getCourseName()) {
				
				throw new Exception("The name Course was chosen earlier. Try a new name");
				
			}
			
		}
		
		if (course.getPrice()<0) {
			throw new Exception("The price of the course cannot be less than zero");
		}
		return true;
	}
	
	

}
