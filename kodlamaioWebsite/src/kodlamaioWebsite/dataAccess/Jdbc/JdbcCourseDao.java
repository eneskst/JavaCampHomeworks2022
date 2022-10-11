package kodlamaioWebsite.dataAccess.Jdbc;

import kodlamaioWebsite.dataAccess.ICourseDao;

import kodlamaioWebsite.entities.Course;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public void addCourse(Course course) {
		System.out.println("Course of " + course.getCourseName() + " added to database with using JDBC. ");
	}

}
