package dataAccess;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	String messageAdd ="Added to database with Hibernate : ";
	String messageDelete="Deleted from database with Hibernate : ";
	String messageUpdate ="Updated with Hibernate : ";
	
	@Override
	public void add(Category category) {
		System.out.println(messageAdd+category.getCategoryName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println(messageDelete+category.getCategoryName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println(messageUpdate+category.getCategoryName());
		
	}
	
	

}
