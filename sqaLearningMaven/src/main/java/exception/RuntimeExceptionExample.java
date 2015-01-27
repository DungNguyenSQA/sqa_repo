package exception;

public class RuntimeExceptionExample {
	
	public static void main(String args[]){
		divideOper();
		
		try{
			arrayOper();
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Got array index exception. Caught from calling method.");
		}
		
		NullOper();
	}
	
	public static void divideOper(){
		//This will handle the error itself
		//int a = 2/0; this will not be handled by try catch
		System.out.println("Entering in divdeOper");
		int i = 0;
		try{
			i = 5/0;
			int j = 6/4;			
		}catch(ArithmeticException ae){
			//ae.printStackTrace();
			System.out.println("Got the Arithmetic Exception and handled it. moving on...");
			//int k = 4/2; not recommended no logic should be here			
		}
		System.out.println("Value of i is : "+i);
	}
	
	public static void arrayOper(){
		int[] intArr = new int[]{1,2,3};
		System.out.println(intArr[4]);
	}
	
	public static void NullOper(){
		String testStr = new String("test");
		try{
			testStr = null;
			System.out.println(testStr.substring(4));			
		}catch(Exception e){
			System.out.println("Caught the exception using super class exception");
		}		
	}
}
