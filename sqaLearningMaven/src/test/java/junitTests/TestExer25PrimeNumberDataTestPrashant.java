package junitTests;

import homeExercise.TestExer25PrimeNumber;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class TestExer25PrimeNumberDataTestPrashant {
	
	private int inputNumber;
	private boolean isPrime;
	
	public TestExer25PrimeNumberDataTestPrashant(int inputNumber, boolean isPrime){
		this.inputNumber = inputNumber;
		this.isPrime = isPrime;	
	}
	
	@Parameters(name= "{index}-{0} is prime number : {1}")
	public static Collection<Object[]> getTestData(){
		Object[][] primeInput = new Object[][]{{3,true},{4,false},{5,true}};
		return Arrays.asList(primeInput);
	}
	
	@Test
	public void testPrimeNumber(){
		Assert.assertTrue(TestExer25PrimeNumber.validate(inputNumber)==isPrime);
	}
}
