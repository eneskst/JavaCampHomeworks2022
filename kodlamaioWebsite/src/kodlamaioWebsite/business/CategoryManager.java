package kodlamaioWebsite.business;

import kodlamaioWebsite.core.logging.IBaseLogger;
import kodlamaioWebsite.dataAccess.ICategoryDao;
import kodlamaioWebsite.entities.Category;

public class CategoryManager {

	private ICategoryDao categoryDao;
	private IBaseLogger[] loggers;

	public CategoryManager(ICategoryDao categoryDao, IBaseLogger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	Category category1;
	Category category2;

	public void categoryChecker(Category category1, Category category2) throws Exception {
		if (category1.getCategoryName().toLowerCase().strip()
				.equals(category2.getCategoryName().toLowerCase().strip()) == false) {
			categoryDao.addCategory(category1);
			for (IBaseLogger logger : loggers) {
				logger.log("Logged to category of " + category1.getCategoryName()
						+ " checked and new category is writen.");
			}
			System.out.println("\n\n");

		} else {
			for (IBaseLogger logger : loggers) {
				logger.log(category1.getCategoryName() + " could not writen.");
			}

			throw new Exception("There is a category with the same name.");
		}
	}

}