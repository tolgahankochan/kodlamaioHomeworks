package dataAccess;

import entities.Educator;

public class HibernateEducatorDao implements EducatorDao{

	String messageAdd ="Added to database with Hibernate : ";
	String messageDelete="Deleted from database with Hibernate : ";
	String messageUpdate ="Updated with Hibernate : ";
	
	
	@Override
	public void add(Educator educator) {
		System.out.println(messageAdd+educator.getFirstName()+" "+educator.getLastName());
		
	}

	@Override
	public void delete(Educator educator) {
		System.out.println(messageDelete+educator.getFirstName()+" "+educator.getLastName());
		
	}

	@Override
	public void update(Educator educator) {
		System.out.println(messageUpdate+educator.getFirstName()+" "+educator.getLastName());
		
	}
}
