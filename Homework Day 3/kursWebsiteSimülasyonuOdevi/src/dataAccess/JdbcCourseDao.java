package dataAccess;

import entities.Course;

public class JdbcCourseDao implements CourseDao{
	
	String messageAdd ="Added to database with Jdbc : ";
	String messageDelete="Deleted from database with Jdbc : ";
	String messageUpdate ="Updated with Jdbc : ";
	
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
