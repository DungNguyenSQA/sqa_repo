//package classExercise; //Change for Git
package homeExercise;


public class CalculatorOverload {
	public static int sum(int a, int b){
		System.out.println("inside int sum");
		int sum = a+b;
		return sum;
	}

	public static int subtract(int a, int b){
		System.out.println("inside int subtract");
		int result = a-b;
		return result;
	}
	
	public static int multiply(int a, int b){
		System.out.println("inside int multiply");
		int result = a*b;
		return result;
	}
	
	public static float divide(float a, float b){
		System.out.println("inside float divide");
		float result = a/b;
		return result;
	}
	
	public static double sum(double a, double b){
		System.out.println("inside double sum");
		double sum = a+b;
		return sum;
	}

	public static double subtract(double a, double b){
		System.out.println("inside double subtract");
		double result = a-b;
		return result;
	}
	
	public static double multiply(double a, double b){
		System.out.println("inside double multiply");
		double result = a*b;
		return result;
	}
	
	public static double divide(double a, double b){
		System.out.println("inside double divide");
		double result = a/b;
		return result;
	}
}
