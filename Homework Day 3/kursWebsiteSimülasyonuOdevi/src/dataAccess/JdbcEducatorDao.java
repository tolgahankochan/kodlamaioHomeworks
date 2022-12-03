package dataAccess;

import entities.Educator;

public class JdbcEducatorDao implements EducatorDao {
	
	String messageAdd ="Added to database with Jdbc : ";
	String messageDelete="Deleted from database with Jdbc : ";
	String messageUpdate ="Updated with Jdbc : ";
	
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
