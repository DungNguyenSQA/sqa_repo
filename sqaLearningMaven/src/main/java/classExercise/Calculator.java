package classExercise;


//Write a function that loops till a given number and print all the numbers
//in the sequence till that. for e.g.
//If number given as 5, print number 1... to 5.
//If number is 10, print number 1... to 10.

public class Calculator {
	public static void main(String args[]){
		//Defining the variables;
		int a = 2;
		int b = 6;
		float f1= 6.4f;
		float f2 = 3.2f;
		
		//Calling the functions
		int sumResult = sum(a,b);
		int sub = subtract(a,b);
		int mul = multiply(a,b);
		float div = divide(f1,f2);
		
		//System.out.println(sumResult + sub);
		System.out.println(sum(a,b)+subtract(a,b));
		//sum of sumResult and sub
		
		//Printing out the results
		System.out.println("Sum of "+a+" and "+b+" = "+sumResult);
		System.out.println("Difference of "+a+" and "+b+" = "+sub);
		System.out.println("Product of "+a+" and "+b+" = "+mul);
		System.out.println("Division of "+f1+" and "+f2+" = "+div);
	}
	
	//Definition of calculator functions
	public static int sum(int a, int b){
		int sum = a+b;
		return sum;
	}

	public static int subtract(int a, int b){
		int result = a-b;
		return result;
	}
	
	public static int multiply(int a, int b){
		int result = a*b;
		return result;
	}
	
	public static float divide(float a, float b){
		float result = a/b;
		return result;
	}
}
