package exception;

/*
 * Rule of try block is that:
 * Try block should be followed by either a catch block or a finally block or by
 * catch/finally.
 * It will go to catch only when same type of exception is thrown.
 * It will go to finally regardless of exception is thrown or not.
 */
public class SimpleExceptionExample {
	
	//No error handling
//	public static void main(String args[]){
//		int i = 0;
//		int division = 5/i;
//		System.out.println("Value of division is : "+division);
//		System.out.println("Statement after the division");
//	}
	
//	//With error handling:
//	public static void main(String args[]){
//		int i = 0;
//		try{
//			int division = 5/i;
//			//below line will not get exectued if exception is thrown, execution
//			//will directly go to catch block
//			System.out.println("Value of division is : "+division);
//		}catch(ArithmeticException e){
//			System.out.println("Inside catch block");
//			//If ArithmeticException is thrown only then everything inside 
//			//the catch block will get executed.
//			e.printStackTrace();
//		}		
//		System.out.println("Statement after the division");
//	}
	
	//Error handling with try / catch/ finally
	//With error handling:
	public static void main(String args[]){
		int i = 1;
		int division = 0;
		try{
			division = 5/i;
			//below line will not get exectued if exception is thrown, execution
			//will directly go to catch block
			System.out.println("Value of division is : "+division);
			//db closing logic
		}catch(ArithmeticException e){
			System.out.println("Inside catch block");
			//If ArithmeticException is thrown only then everything inside 
			//the catch block will get executed.
			e.printStackTrace();
		}finally{
			//Whatever you write inside the finally block is 
			//guaranteed to be exectued.
			System.out.println("This will always get printed");
		}
		System.out.println("Statement after the division");
	}
	
	//you can also have just try and finally without a catch block.
//	public static void main(String args[]){
//		int i = 1;
//		int division = 0;
//		try{
//			division = 5/i;
//			//below line will not get exectued if exception is thrown, execution
//			//will directly go to catch block
//			System.out.println("Value of division is : "+division);
//			//db closing logic
//		}finally{
//			//Whatever you write inside the finally block is 
//			//guaranteed to be exectued.
//			System.out.println("This will always get printed");
//		}
//		System.out.println("Statement after the division");
//	}
}
