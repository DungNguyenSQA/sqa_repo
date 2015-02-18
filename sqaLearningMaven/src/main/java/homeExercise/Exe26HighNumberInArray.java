package homeExercise;

public class Exe26HighNumberInArray {

	public static void main(String[] args) {

/*		Exercise 26: JUnit simple: 
 *			• Write a program, which takes an array of int 
 *			and return the highest number from that 
 *			array. 
 *			• JUnit Test Cases for above program. 
 *			• Run the JUnit Test case for above program. 
*/	
		int[] varIntArr = new int[]{1,3,2,4,6,5,0};
		int varHigh = highestNumber(varIntArr);
		System.out.println("Highest number : "+varHigh);
}
	
	public static int highestNumber(int[] varArray){
		int varInt = 0;
		for (int varHigh : varArray){
			if (varInt < varHigh){
				varInt = varHigh;
			}
		}
		return varInt;
	}

}
