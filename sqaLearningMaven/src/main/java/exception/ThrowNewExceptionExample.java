package exception;

public class ThrowNewExceptionExample {
	
	public static void main(String args[]){		
		try{
			add(5,0);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static int add(int a, int b) throws Exception{
		Exception myExcepton = new Exception("Sum with 0 is not allowed");
		int sum = 0;
		if(b <= 0){
			throw myExcepton;
		}
		return sum;
	}
}
