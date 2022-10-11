package kodlamaioWebsite.core.logging;

public class FileLogger  implements IBaseLogger {

	@Override
	public void log(String data) {
		System.out.println("Logged to the file: " + data);
	
	}

	
}
