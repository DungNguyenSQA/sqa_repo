package exception;

public class FinallyExceptionExample {

	public static void main(String args[]){
		performDBOperation("select * from table");
		String str = performFileOper();
		System.out.println("Output is : "+str);
	}

	private static void performDBOperation(String sql){
		System.out.println("Entering into DBOperation");
		System.out.println("opening DB connection");
		try{
			String test = sql.substring(100);
			System.out.println("Quering the DB");
		}catch(Exception e){
			System.out.println("Exception caught while doing db operation.");			
		}finally{
			System.out.println("I am finally, I will close the db connection");
		}
	}

	private static String performFileOper(){
		System.out.println("Inside performFileOper");
		try{
			String str = "Performing file operations";
			System.out.println(str);
			//str.substring(400);
			//Even though this is a return but finally with get called before this
			return str;			
		}finally{
			System.out.println("Closing the file");
		}
	}
}
