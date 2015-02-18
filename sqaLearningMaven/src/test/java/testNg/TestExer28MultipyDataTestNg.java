package testNg;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static_example.Calculator;

public class TestExer28MultipyDataTestNg {
	
	@DataProvider(name="multiplyTest")
	public static Object[][] getMultiplyData(){
		Object[][] multArr = new Object[][]{
				{2,2,4},{3,3,9},{4,4,16}
		};
		return multArr;
	}
	
	@Test(dataProvider="multiplyTest")
	public void testNgMultiply(int oper1, int oper2, int result){
		Assert.assertEquals(Calculator.mult(oper1, oper2), result);
	}
}
