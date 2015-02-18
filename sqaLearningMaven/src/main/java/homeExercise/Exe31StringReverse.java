package homeExercise;

public class Exe31StringReverse {

	public static void main(String[] args) {
//		Exercise 31:
//		1.Write a java program that reverses the given input string.
//		2.For e.g. If I call the function with argument “Prashant”. 
//		it should print “tnahsarP”.
//		Hint : try to use String function to convert to char array 
//		and then loop through the array backwords.

		String varString = new String("Reverse me");
		System.out.println("String "+varString+" becomes "+reverseString(varString));
	}

	public static String reverseString(String varString){
		//Reverse a string
		int varLength = varString.length();
		//Define an char array and convert the string to this array
		char[] varArray = new char[varLength];
		varArray = varString.toCharArray();
		//Loop through the array backward
		String strString = "";
		for (int i = varLength-1; i>=0; i--){
			strString += varArray[i];
		}
		return strString;
	}
}
