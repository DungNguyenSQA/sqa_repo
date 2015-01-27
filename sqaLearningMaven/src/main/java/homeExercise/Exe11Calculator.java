package homeExercise;

public class Exe11Calculator {

//	Exercise 11: Write a Calculator class. It provides 4 
//	methods. Add, subtract, multiply and divide.  
//	All the methods take two integer parameter and 
//	performs the respective operation and returns the 
//	result. Write a CalculatorCaller class. Call the add, 
//	subtract, multiply and divide methods and print 
//	the result values without creating the object of Calculator class. 
//	private int intA;
//	private int intB;
	
	public static int add(int a, int b){
		return a+b;
	}
	
	public static int mult(int a, int b) { 
		return a*b; 
	}
	
	public static int sub(int a, int b) { 
		return a-b; 
	}
	
	public static int div(int a, int b){
		return a/b;
	}
		
//	public int getIntA(){
//		return intA;
//	}
//	public void setIntA(int intA){
//		this.intA = intA;
//	}
//	
//	public int getIntB(){
//		return intB;
//	}
//	public void setIntB(int intB){
//		this.intB =intB;
//	}
}
