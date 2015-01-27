package classExercise;

//Write a function that loops till a given number and print all the numbers
//in the sequence till that. for e.g.
//If number given as 5, print number 1... to 5.
//If number is 10, print number 1... to 10.
public class ForLoopFunction {
	
	public static void main(String args[]){
		int num1 = 4;		
		printNumbers(num1);
		System.out.println("Calling method 2nd time:");
		
		num1 = 5;
		printNumbers(num1);
		System.out.println("Calling method 3rd time:");
		
		num1 = 0;
		printNumbers(num1);
	}
	
	public static void printNumbers(int upperLimit){
		for(int i=1; i<=upperLimit; i++){
			System.out.println("i is : "+i);
		}
	}
}
