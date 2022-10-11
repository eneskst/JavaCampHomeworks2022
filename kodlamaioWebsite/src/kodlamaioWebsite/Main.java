package kodlamaioWebsite;

import java.util.ArrayList;
import java.util.List;

import kodlamaioWebsite.business.CategoryManager;
import kodlamaioWebsite.business.CourseManager;
import kodlamaioWebsite.business.InstuctorManager;
import kodlamaioWebsite.core.logging.DatabaseLogger;
import kodlamaioWebsite.core.logging.FileLogger;
import kodlamaioWebsite.core.logging.IBaseLogger;
import kodlamaioWebsite.core.logging.MailLogger;
import kodlamaioWebsite.dataAccess.Hibernate.HibernateCategoryDao;
import kodlamaioWebsite.dataAccess.Hibernate.HibernateCourseDao;
import kodlamaioWebsite.dataAccess.Hibernate.HibernateInstuctorDao;
import kodlamaioWebsite.dataAccess.Jdbc.JdbcCategoryDao;
import kodlamaioWebsite.dataAccess.Jdbc.JdbcCourseDao;
import kodlamaioWebsite.dataAccess.Jdbc.JdbcInstuctorDao;
import kodlamaioWebsite.entities.Category;
import kodlamaioWebsite.entities.Course;
import kodlamaioWebsite.entities.Instuctor;

public class Main {

	public static void main(String[] args) throws Exception {

		IBaseLogger[] loggers = new IBaseLogger[] { new FileLogger(), new DatabaseLogger(), new MailLogger() };

		

		Category category1 = new Category(1, "Java");
		Category category2 = new Category(2, "C++");
		Category category3 = new Category(3, "Python");
		
		Course course1 = new Course();
		course1.setCategoryId(1);
		course1.setCourseDescription("Basics of Java");
		course1.setCategoryId(1);
		course1.setCourseImageUrl("javasymbol.html");
		course1.setCourseInstuctor("Engin Demiroğ");
		course1.setCourseName("Introduction to Java");
		course1.setCoursePrice(500);

		Course course2 = new Course();
		course2.setCategoryId(2);
		course2.setCourseDescription("Basics of C++");
		course2.setCategoryId(2);
		course2.setCourseImageUrl("cplusplussymbol.html");
		course2.setCourseInstuctor("Engin Demiroğ");
		course2.setCourseName("Introduction to C++");
		course2.setCoursePrice(1000);

		Instuctor instuctor1 = new Instuctor();
		instuctor1.setInstuctorId(1);
		instuctor1.setInstuctorFirstName("Engi");
		instuctor1.setInstuctorLastName("Demiroğ");

		Instuctor instuctor2 = new Instuctor();
		instuctor2.setInstuctorId(1);
		instuctor2.setInstuctorFirstName("Engin");
		instuctor2.setInstuctorLastName("Demiroğ");

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.categoryChecker(category1, category2);

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.courseChecker(course1, course2);

		InstuctorManager instuctorManager = new InstuctorManager(new JdbcInstuctorDao(), loggers);
		instuctorManager.instuctorChecker(instuctor1, instuctor2);

		
		

	}

}
