package basicLearning;

public class CheckPassFail {
	//Internally JAVA is calling CheckPassFail.main(args);
	//What we see inside the () is called as parameter list
	//data type and variable for e.g. (String name)

	public static void main(String[] args) {
//		Exercise 1 : CheckPassFail (if-else): Write a 
//		program called CheckPassFail which prints 
//		"PASS" if the int variable "mark" is more than or 
//		equal to 50; or prints "FAIL" otherwise.
		
		//we do not give access modifier to local variables for e.g.
		//public int mark=50; is invalid.
		//you have to initialize the local variable with some value.
		//Class level variables have default initialization but not local variables.
		int mark = 49;
		
		if (mark >= 50) {
			System.out.println(mark + " ---> PASS!");
		} else {
			System.out.println(mark + " ---> FAIL");
		}
	}

}
