//package homeExercise; //Change for Git
package basiclearning;


public class Exercise04Functions {
	
	/*
	 * Define a function that accepts two int variables 
	 * and returns the multiplication value of that. 
	 * Call this function from the main method and 
	 * print the return value.
	 */
	public static void main(String args[]){
		System.out.println("Entering into main");
		int value = needToCall(5,3);
		System.out.println("Exiting main with multiplication = "+value);
		value = needToCall(10,10);
	}

	//Method definition
	//Signature of method
		//AccessModifier ReturnType nameOfMethod(Parameter List<optional>)
			//Parameter list == dataType variableName e.g. (String str,....)
	//opening brace {
	//body of the method (logic to be implemented)
	//closing brace }
	//Caller looks like : int value = needToCall(5,3);
	public static int needToCall(int a, int b){
		int myVariable = a * b;
		return myVariable;
	}	
}