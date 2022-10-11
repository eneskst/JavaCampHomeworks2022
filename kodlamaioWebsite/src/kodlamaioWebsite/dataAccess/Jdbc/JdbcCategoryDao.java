package kodlamaioWebsite.dataAccess.Jdbc;

import kodlamaioWebsite.dataAccess.ICategoryDao;
import kodlamaioWebsite.entities.Category;


public class JdbcCategoryDao implements ICategoryDao {

	@Override
	public void addCategory(Category category) {
		System.out.println("Category of " + category.getCategoryName() + " added to database with using JDBC. ");

	}

}
