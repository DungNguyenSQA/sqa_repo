package homeExercise;

public class Exercise03SumLoop {
	public static void main(String[] args) {
		//  Exercise 3 : Sum (Loop): Write a program called 
		//  Sum to produce the sum of 1, 2, 3, ..., to an 
		//  upperbound limit of 2000;
		int varSum = 0;
		int i = 0;
		
		//keep on running the loop till condition is true.
		while (varSum<2000) {
			varSum += i;
			//varSum = varSum + i;
			i++;
		}
		
		//sample for loop
		for(int j=0; j<10; j++){
			varSum = varSum+j;
		}
		System.out.println("Value of varsum is : "+varSum);
		
		varSum -= i;
		varSum = varSum + 1;
		System.out.println("The sum in While loop is : "+varSum);
	}
}
