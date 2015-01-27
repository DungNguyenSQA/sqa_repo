package homeExercise;

import org.apache.log4j.Logger;

public class Exe11CalculatorCaller {

	private static final Logger log = Logger.getLogger(Exe11CalculatorCaller.class);
	// static because I just need one instantiation of Logger
	
	public static void main(String[] args) {

//		Exercise 11: Write a Calculator class. It provides 4 
//		methods. Add, subtract, multiply and divide.  
//		All the methods take two integer parameter and 
//		performs the respective operation and returns the 
//		result. Write a CalculatorCaller class. Call the add, 
//		subtract, multiply and divide methods and print 
//		the result values without creating the object of Calculator class. 
		
		int x = 2;
		int y = 2;
		int varResult;
		
		varResult = Exe11Calculator.add(x,y);
//		System.out.println("Sum = "+ varResult);
		log.info("Sum = "+ varResult);			//QA
		
		
		varResult = Exe11Calculator.sub(x, y);
//		System.out.println("Sub = "+ varResult); 
		log.info("Sub = "+ varResult);
		
		varResult = Exe11Calculator.mult(x, y);
//		System.out.println("Mult = "+ varResult);
		log.info("Mult = "+ varResult);
		
		varResult = Exe11Calculator.div(x, y);
//		System.out.println("Div = "+ varResult);
		log.info("Div = "+ varResult);
		
	}

}
