package basiclearning;

public class ExerciseSum {

	public static void main(String[] args) {
//		Exercise 3 : Sum (Loop): Write a program called 
//		Sum to produce the sum of 1, 2, 3, ..., to an 
//		upperbound limit of 2000;
		
		int varSum = 0;
	
		int i = 0;
		while (varSum<2000) {
			varSum += i;
			i++;
		}
		varSum -= i;
		varSum = varSum + 1;
		System.out.println("The sum in While loop is : "+varSum);
	}

}
