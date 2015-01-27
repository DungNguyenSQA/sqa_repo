package homeExercise;

public class Excercise4Functions {
	
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
	}

	public static int needToCall(int a, int b){
		int myVariable = a * b;
		return myVariable;
	}
}