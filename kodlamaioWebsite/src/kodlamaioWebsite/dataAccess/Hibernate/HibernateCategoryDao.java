package kodlamaioWebsite.dataAccess.Hibernate;

import kodlamaioWebsite.dataAccess.ICategoryDao;
import kodlamaioWebsite.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {

	@Override
	public void addCategory(Category category) {

		System.out.println("Category of " + category.getCategoryName() + " added to database with using Hibernate. ");
	}

}