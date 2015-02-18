package testNg;

import java.util.Arrays;
import java.util.Collection;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import homeExercise.Exe25PrimeNumber;

public class TestNgPrimeNumber {

//	Write	a program which takes number and returns if number is prime number or not.
//	Write the test cases and test suite for above program.
//	Write Data driven Test Cases for above program.
//
//
//	Write a program which takes an array of int and return the highest number from that array.
//	JUnit Test Cases for above program.
//	Run the Junit Test case for above program .

	
	private int inputNumber;
	private boolean isPrime;
	
//	public void TestExer25PrimeNumberDataTest(int inputNumber, boolean isPrime){
//		this.inputNumber = inputNumber;
//		this.isPrime = isPrime;	
//	}
//	
//	@DataProvider(name = "primenumber")
//	public static Collection<Object[]> getTestData(){
//		Object[][] primeInput = new Object[][]{{3,true},{4,false},{5,true}};
//		return Arrays.asList(primeInput);
//	}
	@DataProvider(name = "primenumber")
	public static Object[][] getTestData(){
		Object[][] primeInput = new Object[][]{{3,true},{4,false},{5,true}};
		return primeInput;
	}
	@Test(dataProvider="primenumber")	
//	public void testPrimeNumber(){
	public void testPrimeNumber(int inputNumber, boolean isPrime){
		Assert.assertTrue(Exe25PrimeNumber.isPrimeNumber(inputNumber)==isPrime);
	}
}
