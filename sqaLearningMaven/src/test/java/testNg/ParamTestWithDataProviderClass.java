package testNg;

import homeExercise.TestExer25PrimeNumber;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static_example.Calculator;

public class ParamTestWithDataProviderClass {
	Logger log = Logger.getLogger(ParamTestWithDataProviderClass.class);
	private TestExer25PrimeNumber primeNumberChecker;
	private Calculator calc;

	@BeforeMethod
	public void initialize() {
		primeNumberChecker = new TestExer25PrimeNumber();
		calc = new Calculator();
	}		
	
	@Test(dataProviderClass = TestNgDataProvider.class, dataProvider="test1")
	public void testPrimeNumberChecker(Integer inputNumber,
			Boolean expectedResult) {
		log.info(inputNumber + " " + expectedResult);
		Assert.assertEquals(expectedResult,
				primeNumberChecker.validate(inputNumber));
	}
	
	@Test(dataProviderClass = TestNgDataProvider.class, dataProvider="addInput")	
	public void testAdd(int oper1, int oper2, int result){		
		int calcResult = calc.add(oper1, oper2);		
		Assert.assertEquals(calcResult, result);
		log.info("INside testAdd of dataprovider 2");
	}
}
