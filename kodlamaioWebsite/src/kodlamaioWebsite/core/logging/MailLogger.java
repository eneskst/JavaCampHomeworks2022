package kodlamaioWebsite.core.logging;

public class MailLogger implements IBaseLogger {

	@Override
	public void log(String data) {
		System.out.println("Logged via mail: " + data);

	}

}
