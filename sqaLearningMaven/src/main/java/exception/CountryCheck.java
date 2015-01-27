package exception;

public class CountryCheck {

	public static void main(String[] args) {

	//Write a class CountryCheck
	//in this class write a function "boolean isUSAPresent(String arr[])"that takes String[] as parameter.
	//loop through the array and check if "USA" is one of the country.
	//if "USA" is not present in string array then throw new Exception "usa not found"
	//Write a main method, create a string[] {"India","Japan","China","Canada"}
	//call the function isUSAPresent and pass the above created array and put that in try/catch block.
	//
		String[] stringArray = new String[]{"India","Japan","China","Canada"};
		try{
			isUSAPresent(stringArray);
		}catch (Exception e){
			System.out.println("This is inside catch block.");
			System.out.println(e.getMessage());					
		}
	
	}	
	public static boolean isUSAPresent(String[] args) throws Exception{
		
		//Write a function "boolean isUSAPresent(String arr[])"that takes String[] as parameter.
		//loop through the array and check if "USA" is one of the country.
		//if "USA" is not present in string array then throw new Exception "usa not found"
		boolean USAPresent = false;
		for (String element : args){
			if (element.equals("USA")){
				USAPresent = true;
			}
		}
		if (!USAPresent){
			throw new Exception("USA not found!");
		}
		return USAPresent;
	}

}
