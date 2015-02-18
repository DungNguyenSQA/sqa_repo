package basicLearning;

public class ArrayExercises {

	public static void main(String[] args) {
//		Declare an array of char which takes 5 element : a,b,c,d and e
//		Declare an array of int and initialize element in the array
//		Write a method which takes a parameter of array of int and print the size of any array.
//		Write a method which takes a parameter of array of String and print all the items in array	
		
		String[] varCharArr = new String[]{"a","b","c","d","e"};
		
		int[] varIntArr = new int[10];
		
		printSize(varIntArr);
		System.out.println("...Array of String...");
		printVal(varCharArr);
		
	}
	
	public static void printSize(int[] inputArr){
		System.out.println("Size of this array is : "+inputArr.length);
	}

	public static void printVal(String[] inputArr){
		for (String temp : inputArr){
			System.out.println("Value is : "+temp);
		}
	}
}
