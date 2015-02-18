package testNg;

import homeExercise.TestExer25PrimeNumber;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static_example.Calculator;

@Test(groups={ "checkintest"})
public class ParamTestWithDataProvider1 {
	Logger log = Logger.getLogger(ParamTestWithDataProvider1.class);
	private TestExer25PrimeNumber primeNumberChecker;
	private Calculator calc;

	@BeforeMethod
	public void initialize() {
		primeNumberChecker = new TestExer25PrimeNumber();
		calc = new Calculator();
	}
	
	//@Test(dataProviderClass = TestNgDataProvider.class, dataProvider="primeNumberData")
	@Test(dataProvider = "test1")	
	public void testPrimeNumberChecker(Integer inputNumber,Boolean expectedResult) {
		//log.info(inputNumber + " " + expectedResult);
		System.out.println(inputNumber + " " + expectedResult);
		Assert.assertEquals(expectedResult,
				primeNumberChecker.validate(inputNumber));
	}
	
	@Test(dataProvider = "addInput")
	public void testAdd(int oper1, int oper2, int result){		
		int calcResult = calc.add(oper1, oper2);		
		Assert.assertEquals(calcResult, result);
		log.info("inside testAdd");
	}
	
	@DataProvider(name = "test1")
	public static Object[][] primeNumbers() {
		return new Object[][] { { 2, true }, { 6, false }, { 19, true },
				{ 22, false }, { 23, true } };
	}
	
	@DataProvider(name = "addInput")
	public static Object[][] getCalcAddData(){
		return new Object[][] { { 2, 2,4}, {3,3,6}, { 4,4,8}};
		/*
		 * 2,2,4
		 * 3,3,6
		 * 4,4,8
		 */
//		Object[][] add2dArr = new Object[3][3];
//		add2dArr[0][0] = 2;
//		add2dArr[0][1] = 2;
//		add2dArr[0][2] = 4;
//		add2dArr[1][0] = 3;
//		add2dArr[1][1] = 3;
//		add2dArr[1][2] = 6;
//		add2dArr[2][0] = 4;
//		add2dArr[2][1] = 4;
//		add2dArr[2][2] = 8;
		
	}
}
