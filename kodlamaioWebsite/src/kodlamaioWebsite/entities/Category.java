package kodlamaioWebsite.entities;

public class Category {
	private String categoryName;
	private int categoryId;

	public Category(int categoryId, String categoryName) {
		super();
		this.categoryName = categoryName;
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
