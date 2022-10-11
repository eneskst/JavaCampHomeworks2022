package kodlamaioWebsite.dataAccess.Hibernate;

import kodlamaioWebsite.dataAccess.IInstuctorDao;
import kodlamaioWebsite.entities.Instuctor;

public class HibernateInstuctorDao implements IInstuctorDao {

	@Override
	public void addInstuctor(Instuctor instuctor) {
		System.out.println(instuctor.getInstuctorFirstName() + " " + instuctor.getInstuctorLastName()
				+ " added to database as instuctor with using Hibernate. ");

	}

}
