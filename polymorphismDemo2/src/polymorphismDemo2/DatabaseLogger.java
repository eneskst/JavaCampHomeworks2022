package polymorphismDemo2;

public class DatabaseLogger extends BaseLogger{
	public void Log(String message) {
		System.out.println("Logged to database" + message);
	}
}
