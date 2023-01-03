
public class AgeCheckException extends Exception  {
	
// the message I want to print when  call this exception
	public String message;
	public AgeCheckException(String message) {
		super(message);
		this.message=message;
	}
}
