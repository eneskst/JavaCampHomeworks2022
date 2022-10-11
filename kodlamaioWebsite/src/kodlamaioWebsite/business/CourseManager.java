package kodlamaioWebsite.business;

import kodlamaioWebsite.core.logging.IBaseLogger;
import kodlamaioWebsite.dataAccess.ICourseDao;
import kodlamaioWebsite.entities.Course;

public class CourseManager {

	private ICourseDao courseDao;
	private IBaseLogger[] loggers;

	public CourseManager(ICourseDao courseDao, IBaseLogger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void courseChecker(Course course1, Course course2) throws Exception {
		if (course1.getCourseName().toLowerCase().equals(course2.getCourseName().toLowerCase()) == false) {
			for (IBaseLogger logger : loggers) {
				logger.log("Logged to course of " + course1.getCourseName() + " course name is checked.");
			}
			System.out.println("\n\n");
			if (course1.getCoursePrice() > 0) {
				courseDao.addCourse(course1);
				for (IBaseLogger logger : loggers) {
					logger.log("Logged to course of " + course1.getCoursePrice() + " course price is checked."
							+ course1.getCourseName() + " is created.");
				}
				System.out.println("\n\n");
			} else if (course1.getCoursePrice() == 0) {
				for (IBaseLogger logger : loggers) {
					logger.log("Logged to course of " + course1.getCoursePrice() + " course price is checked."
							+ "Course price is zero. " + course1.getCourseName() + " could not created.");
				}
				throw new Exception("Course price could not be free.");
			} else if (course1.getCoursePrice() < 0) {
				for (IBaseLogger logger : loggers) {
					logger.log("Logged to course of " + course1.getCoursePrice() + " course price is checked."
							+ "Course price is negative. " + course1.getCourseName() + " could not created.");
				}
				System.out.println("\n\n");
				throw new Exception("Course price could not be negative.");
			}
		} else {
			throw new Exception("Course name is not unique.");

		}
	}

}