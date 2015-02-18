package homeExercise;

public class Exe25PrimeNumber {

	public static void main(String[] args) {
		
/*		Exercise 25: Parameterized (JUnit)
 *		• Write a program, which takes number and 
 *		returns if number is prime number or not. 
 *		• Write the test cases for above program. 
 *		• Write Data driven Test Cases for above 
 *		program.
*/		 
		int isPrime = 31;
		if (isPrimeNumber(isPrime)){
			System.out.println("The number "+isPrime+" is a prime number.");
		}else{
			System.out.println("The number "+isPrime+" is NOT a prime number.");			
		}
	}

	public static boolean isPrimeNumber(int varNumber){
		
		//Prime number must be > 1 and must not be EVENLY divisible by any
		//incremental number upto sqrt of that number 
		if (varNumber > 1){
		    int i;
		    for (i=2; i*i<=varNumber; i++) {
		        if (varNumber % i == 0){
		        	return false;
		        }
		    }
		    return true;
		}else{
			return false;
		}
	}
}
