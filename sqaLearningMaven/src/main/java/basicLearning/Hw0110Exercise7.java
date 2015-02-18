package basicLearning;

public class Hw0110Exercise7 {

	public static void main(String[] args) {
//		Exercise 6: Define a function that accepts a String array and 
//		print only first 3 characters of every string value. 
//		Call this function from the main method and pass a String array that has name of any 5 countries.
//		
//		Exercise 7: In the above example, add the validation to only do substring if 
//		string length is greater than 3 and change the case of all the countries 
//		to lower. (hint : String.toLowerCase()).
//		Also, remove if there are any leading or trailing white spaces in 
//		the name of the country. for e.g. " USA ". hint . String.trim();
//
		String[] varArr = new String[]{"USA "," FRANCE","  JAPAN ","AUSTRALIA "," ETHIOPIA"};
		subString(varArr);
		System.out.println("After call : ");
		for (int i = 0; i < varArr.length; i++){
			System.out.println("Ele #"+i+" : "+varArr[i]);
		}
		
	}
	public static String[] subString(String[] inputArr){
		for (int i=0; i<inputArr.length; i++){
			if (inputArr[i].length() > 3){
				System.out.println("Ele #"+i+" : "+ inputArr[i].substring(0,3));
			}
			inputArr[i] = (inputArr[i].toLowerCase()).trim();
			// or inputArr[i] = inputArr[i].toLowerCase().trim(); = we call this "method chaining".

		}
		return inputArr;
	}
}
