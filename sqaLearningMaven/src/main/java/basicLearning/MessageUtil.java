package basicLearning;

public class MessageUtil {	
	private String message;

	// Constructor
	// @param message to be printed
	public MessageUtil(String message) {
		this.message = message;
	}

	// prints the message
	public String printMessage() {
		System.out.println(message);
		return message;
	}

 
	public String salutationMessage() {
		String message1 = "Welcome " + message;
		System.out.println(message1);
		return message1;
	}
	
	public String exitMessage() {
		message = "bye bye " + message;
		System.out.println(message);
		return message;
	}	
}
