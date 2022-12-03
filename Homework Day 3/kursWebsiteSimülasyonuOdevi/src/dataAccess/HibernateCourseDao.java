package dataAccess;

import entities.Category;
import entities.Course;

public class HibernateCourseDao implements CourseDao{

	
	String messageAdd ="Added to database with Hibernate : ";
	String messageDelete="Deleted from database with Hibernate : ";
	String messageUpdate ="Updated with Hibernate : ";
	
	@Override
	public void add(Course course) {
		System.out.println(messageAdd+course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println(messageDelete+course.getCourseName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println(messageUpdate+course.getCourseName());
		
	}
	
}
