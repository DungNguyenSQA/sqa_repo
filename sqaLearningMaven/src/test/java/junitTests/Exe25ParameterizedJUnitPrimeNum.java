package junitTests;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//import homeExercise.Exe25PrimeNumber;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value=Parameterized.class)
public class Exe25ParameterizedJUnitPrimeNum {

	/*		Exercise 25: Parameterized (JUnit)
	 *		• Write a program, which takes number and 
	 *		returns if number is prime number or not. 
	 *		• Write the test cases for above program. 
	 *		• Write Data driven Test Cases for above 
	 *		program.
	*/		 

	@Test	
	public void testPrimeNumber(){
		System.out.println("inside testPrimeNumber");
//		Assert.assertEquals(true,Exe25PrimeNumber.isPrimeNumber(31));		
	}
	
	 // Write Data driven Test Cases for Prime Number test 
	private int operator;
	private boolean result;

//	Exe25PrimeNumber primeNum = new Exe25PrimeNumber();

	//This constructor is required to have same number of parameters as the input set
	//defined in @Parameters method. every attribute of the array is mapped to parameter 
	//of this constructor.
	public Exe25ParameterizedJUnitPrimeNum(int oper, boolean result){
		this.operator = oper;
		this.result = result;
		}

	@Test
//	public void primeTest(){
//		Assert.assertEquals(primeNum.isPrimeNumber(operator), result);		
//	}
	
	@Parameters(name= "{index}{0}{1}")
//	public static Collection<Exe25ParameterizedJUnitPrimeNum[]> getAddData(){
//		Exe25ParameterizedJUnitPrimeNum[][] dataArr = null;
//		dataArr = new Exe25ParameterizedJUnitPrimeNum[][]{{2,true},{3,true},{4,false},{31,true},{121,false}};		
//		List<Exe25ParameterizedJUnitPrimeNum[]> intArrList = Arrays.asList(dataArr);
//		printOutArrList(intArrList);
//		return intArrList;
//	}	

	public static void printOutArrList(List<Exe25ParameterizedJUnitPrimeNum[]> intArrList){
		int index = 0;
		for(Exe25ParameterizedJUnitPrimeNum[] intArr : intArrList){
			System.out.println("Printing array at index : "+index);
			for(Exe25ParameterizedJUnitPrimeNum arr : intArr){
				System.out.print(arr);
				System.out.print("-");
			}
			index++;
			System.out.println();
		}
	}
}