package testNg;

import java.util.Arrays;
import java.util.Collection;

import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNgPowerOfTwo {

	// Just the power
	@DataProvider(name="dp")
	public static Object[][] data() {
		return new Object[][] { { 3}, { 6 }, { 13 } };
	}

	@Test(dataProvider="dp")
	public void testUserMApping(int powerInput) {
//		int resNum = PowerOfTwo.CalculatePowerOfTwo(powerInput);
		AssertJUnit.assertEquals(Math.pow(2, powerInput), CalculatePowerOfTwo(powerInput), 0);
	}
	
	private int CalculatePowerOfTwo(int power){
		int varNumber = 2;
		for (int i=1;i<power;i++){
			varNumber = varNumber * 2;
		}
		return varNumber;
	}
}
