package kodlamaioWebsite.business;

import kodlamaioWebsite.core.logging.IBaseLogger;
import kodlamaioWebsite.dataAccess.IInstuctorDao;
import kodlamaioWebsite.entities.Instuctor;

public class InstuctorManager {

	private IInstuctorDao instuctorDao;
	private IBaseLogger[] loggers;

	public InstuctorManager(IInstuctorDao instuctorDao, IBaseLogger[] loggers) {
		super();
		this.instuctorDao = instuctorDao;
		this.loggers = loggers;
	}

	public void instuctorChecker(Instuctor instuctor1, Instuctor instuctor2) throws Exception {
		if (instuctor1.getInstuctorFirstName().toLowerCase()
				.equals(instuctor2.getInstuctorFirstName().toLowerCase()) == true
				&& instuctor1.getInstuctorLastName().toLowerCase()
						.equals(instuctor2.getInstuctorLastName().toLowerCase()) == true) {

			for (IBaseLogger logger : loggers) {
				logger.log("Instuctors name checked. " + instuctor1.getInstuctorFirstName() + " "
						+ instuctor1.getInstuctorLastName() + " could not added to instuctor list.");
			}
			throw new Exception(instuctor1.getInstuctorFirstName() + " " + instuctor1.getInstuctorLastName()
					+ " is already in the instuctor list. ");
		} else {
			instuctorDao.addInstuctor(instuctor1);
			for (IBaseLogger logger : loggers) {
				System.out.println(instuctor1.getInstuctorFirstName() + " " + instuctor1.getInstuctorLastName()
						+ " is added to instuctors list.");
			}
		}
	}
}
