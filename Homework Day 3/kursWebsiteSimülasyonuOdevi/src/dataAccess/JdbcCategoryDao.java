package dataAccess;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	String messageAdd ="Added to database with Jdbc : ";
	String messageDelete="Deleted from database with Jdbc : ";
	String messageUpdate ="Updated with Jdbc : ";
	
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
