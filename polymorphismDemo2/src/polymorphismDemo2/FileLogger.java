package polymorphismDemo2;

public class FileLogger extends BaseLogger {
	public void Log(String message) {
		System.out.println("file logged " + message);
	}
}
