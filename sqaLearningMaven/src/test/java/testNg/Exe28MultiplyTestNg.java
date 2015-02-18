package testNg;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import classExercise.Calculator;

public class Exe28MultiplyTestNg {

	@Test(dataProvider = "multInput")
	public void testMult(int oper1, int oper2, int result){
		int caclRes = Calculator.multiply(oper1, oper2);
		Assert.assertEquals(caclRes, result);				
	}
	
	@DataProvider(name = "multInput")
	public static Object[][] multiply(){
		return new Object[][]{{2,2,4},{2,3,6},{2,4,8}};
	}
}