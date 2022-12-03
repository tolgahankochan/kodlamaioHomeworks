package business;

import java.util.Locale.Category;

import core.logging.Logger;
import core.validate.CategoryValidator;
import dataAccess.CategoryDao;

public class CategoryManager{
	
	CategoryDao categoryDao;
	CategoryValidator categoryValidator;
	Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, CategoryValidator categoryValidator, Logger[] loggers) {
		this.categoryValidator = categoryValidator;
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(entities.Category category) throws Exception {

		if (categoryValidator.isValid(category)) 
		{

			this.categoryDao.add(category);
			
			System.out.println("Added new category: " + category.getCategoryName());
			
			for (Logger logger : loggers) {
				logger.log(category.getCategoryName());
			}
			

		}
		

	}

	public void delete(entities.Category category) {
		
		this.categoryDao.delete(category);
		System.out.println(category.getCategoryName() + "Successfully deleted");
	}

	public void update(entities.Category category) {
		
		this.categoryDao.update(category);
		System.out.println(category.getCategoryName() + "Successfully updated");
	}
	

	

	
}
