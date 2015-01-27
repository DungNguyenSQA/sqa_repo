package homeExercise;

public class Exercise11CalculatorCaller {
	
	public static void main(String args[]){
		
		//Directly calling the method within sysout		
		System.out.println("Output of add is " + Exercise11Calculator.add(2, 2));
				
		int sub = Exercise11Calculator.sub(4, 2);
		System.out.println("Output of sub is "+sub);
		
		int mul = Exercise11Calculator.mul(3, 2);
		System.out.println("Output of sub is "+mul);
		
		int div = Exercise11Calculator.div(4, 2);
		System.out.println("Output of sub is "+div);
	}
}
