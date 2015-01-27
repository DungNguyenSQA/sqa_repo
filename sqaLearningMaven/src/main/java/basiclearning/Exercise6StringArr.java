package homeExercise;

public class Exercise6StringArr {
	
	/*
	 * Define a function that accepts a String array and print 
	 * only first 3 characters of every string value. 
	 * Call this function from the main method and pass a String array 
	 * that has name of any 5 countries.
	 */
	public static void main(String args[]){
		int a = 3;
		float b = 3.54f;
		String[] arrCountry= new String[]{"India"," America ","China","Russia","Mexico"};
		subCountry(arrCountry);
	}
	
	public static void subCountry(String[] arrC){
		//This is for exercise 6
//		for(int i=0;i<arrC.length; i++){
//			String element = arrC[i];
//			String subStr = element.substring(0,3);
//			System.out.println("First 3 chars of "+element+" are : " + subStr);			
//		}
		
		// Using for each for above for loop
//		for(String element : arrC){
//			String subStr = element.substring(0,3);
//			System.out.println("First 3 chars of "+element+" are : " + subStr);
//		}
		
		//This is for exercise 7
		/*
		 * In the above example, add the validation, to only do substring
		 * if string length is greater than 3 
		 * and change the case of all the countries to lower. (hint : String.toLowerCase()).
			Also, remove if there are any leading or trailing white 
			spaces in the name of the country. 
			for e.g. " USA ". hint . String.trim();
		 */
		//StringBuffer sb = new StringBuffer("abc");
		//sb.append("fdas");
		for(String element : arrC){
			if(element.length() > 3){
				//element + "abc";
				//element.substring(0,3);
				String subStr = element.substring(0,3);
				String lowerCountry = subStr.toLowerCase();
				String trimmedCountry = lowerCountry.trim();
				//method chaining.,result of first method becomes the input for 2nd.
				//String finalCountry = element.substring(0,3).toLowerCase().trim();
				System.out.println("First 3 chars of "+element+" are : " + subStr);
			}			
		}
	}
	
//	public static void subCountry(String[] arrC){		
//		for(int i=0;i<arrC.length; i++){
//			if (arrC.length > 3){
//				System.out.println("Sub String for " + (arrC[i].toLowerCase()).trim() + " is: " + (arrC[i].trim()).substring(0,3));
//			}
//		}
//	}
}
