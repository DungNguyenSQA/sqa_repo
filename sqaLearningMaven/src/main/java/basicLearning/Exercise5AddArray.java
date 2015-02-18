//package homeExercise; //Change for Git
package basicLearning;


public class Exercise5AddArray {
	
	/*
	 * Define a function “addArray” that:
	•	Accepts one int array
	•	Print the size of the array
	•	Returns the sum of array to caller.
	*/	
	public static void main(String args[]){
		//Defining an array
		//Instantiating the array
		//Initializing the array
		int[] toAddArr = new int[]{1,2,3,4};
		int sum = addArray(toAddArr);
		System.out.println("Sum of the array is : "+sum);
		//System.out.println(addArray(toAddArr));
	}
	
	public static int addArray(int[] intArr){
		System.out.println("Size of the array is : "+intArr.length);
		int sum = 0;
		//for(int i=0; i<intArr.length; i++){////
		for(int element : intArr){
			sum += element; //sum = sum + element;
		}
		return sum;
	}
}
