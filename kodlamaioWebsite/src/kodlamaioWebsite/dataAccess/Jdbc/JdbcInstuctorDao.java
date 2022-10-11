package kodlamaioWebsite.dataAccess.Jdbc;

import kodlamaioWebsite.dataAccess.IInstuctorDao;
import kodlamaioWebsite.entities.Instuctor;

public class JdbcInstuctorDao implements IInstuctorDao {

	@Override
	public void addInstuctor(Instuctor instuctor) {
		System.out.println(instuctor.getInstuctorFirstName() + " " + instuctor.getInstuctorLastName()
				+ "is added to database as instuctor with using JDBC. ");

	}

}
