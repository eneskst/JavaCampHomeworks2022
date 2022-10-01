package polymorphismDemo2;

public class EmailLogger extends BaseLogger {
	public void Log(String message) {
		System.out.println("logged to email " + message);
	}
}
