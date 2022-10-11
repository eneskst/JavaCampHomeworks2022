package kodlamaioWebsite.entities;

public class Course {
	private int courseId;
	private int categoryId;
	private double coursePrice;
	private String courseName;
	private String courseImageUrl;
	private String courseDescription;
	private String courseInstuctor;

	public Course(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	public Course() {
	}

	public Course(String courseName, String courseInstuctor) {
		super();
		this.courseName = courseName;
		this.courseInstuctor = courseInstuctor;
	}

	public Course(int courseId, int categoryId, double coursePrice, String courseName, String courseImageUrl,
			String courseDescription, String courseInstuctor) {
		super();
		this.courseId = courseId;
		this.categoryId = categoryId;
		this.coursePrice = coursePrice;
		this.courseName = courseName;
		this.courseImageUrl = courseImageUrl;
		this.courseDescription = courseDescription;
		this.courseInstuctor = courseInstuctor;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseImageUrl() {
		return courseImageUrl;
	}

	public void setCourseImageUrl(String courseImageUrl) {
		this.courseImageUrl = courseImageUrl;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getCourseInstuctor() {
		return courseInstuctor;
	}

	public void setCourseInstuctor(String courseInstuctor) {
		this.courseInstuctor = courseInstuctor;
	}

}
