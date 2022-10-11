package kodlamaioWebsite.dataAccess.Hibernate;

import kodlamaioWebsite.dataAccess.ICourseDao;

import kodlamaioWebsite.entities.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void addCourse(Course course) {
		System.out.println("Course of " + course.getCourseName() + " added to database with using Hibernate. ");
	}

}
