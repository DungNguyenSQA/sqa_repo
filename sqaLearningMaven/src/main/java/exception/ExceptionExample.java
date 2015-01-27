package exception;

public class ExceptionExample {

	public static void main(String[] args) {

//		Write a class ExceptionExample in which:
//		Write a function “StringCheck” which takes a parameter of String
//		StringCheck throws a new “Exception” if String is of more than 10 character.
//		From the main method call StringCheck and enclose the caller with try/catch.
//		Write another function “ArrayElement” which takes a int[] as parameter.
//		ArrayElement return the element at index array.length.
//		Put the function in try/catch.
//		In catch block print the total length of array.
//
		String str = "Example exception";
		try{
			StringCheck(str);
		}catch (Exception e){
			System.out.println("This is inside catch of StringCheck.");
			System.out.println(e.getMessage());			
		}
		System.out.println();
		int[] intArray = new int[]{1,2,3};
		ArrayElement(intArray);
	}

	public static void StringCheck(String string) throws Exception{
		Exception myException = new Exception("String should be lest than 10 characters");
		if (string.length() >10) {
			System.out.println("This is inside StringCheck before throw. String : "+string);
			throw myException;
			//or throw new Exception("String should be lest than 10 characters"); instead of Exception myException = new Exception("...
		}
	}
	
	public static int ArrayElement(int[] intArray){		
		System.out.println("This is inside ArrayElement.");
		try{
			return intArray[intArray.length];
		}catch(Exception e){
			System.out.println("This is inside catch of ArrayElement.");
			System.out.println("Total length of array "+intArray.length);
			return 0;
		}
		// Note: the method will go back to the caller after instruction "return"
		// all statement after "return" is a compile error
	}
}
