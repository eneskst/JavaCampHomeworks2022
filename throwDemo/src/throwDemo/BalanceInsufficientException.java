package throwDemo;

public class BalanceInsufficientException extends Exception{
	
	String message;
	public BalanceInsufficientException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
		
	}

}
