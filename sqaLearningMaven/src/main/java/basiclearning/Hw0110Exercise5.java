package basiclearning;

public class Hw0110Exercise5 {

	public static void main(String[] args) {
//		Exercise 5: Define a function “addArray” that:
//		• Accepts one int array
//		• Print the size of the array
//		• Returns the sum of array to caller.
//
		int varSize = 5;
		int[] varArr = new int[varSize];
		for (int i = 0; i < varSize; i++){
			varArr[i] = i+1;
		}
		System.out.println("Sum of array : "+addArray(varArr));
	}
	
	public static int addArray(int[] inputArr){
		
		int sum=0;
		System.out.println("Size of array : "+inputArr.length);
		for (int i=0; i<inputArr.length; i++){			// or use for(int element : inputArr){
			sum += inputArr[i];							//          sum += element;}
		}
		return sum;
	}
}