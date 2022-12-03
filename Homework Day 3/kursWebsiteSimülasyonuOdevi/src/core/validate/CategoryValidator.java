package core.validate;

import java.util.Iterator;

import entities.Category;

public class CategoryValidator {
	
	Category[] categories;
	
	public CategoryValidator(Category[] categories) {
		this.categories=categories;
	}
	
	public boolean isValid(Category category) throws Exception{
		
		for(Category categories : categories)
		{
			if (categories.getCategoryName()==category.getCategoryName()) {
				
				throw new Exception("The name Kateogri was chosen earlier ! Try a new name");
				
			}
		}
		return true;
		
		
	}

}
