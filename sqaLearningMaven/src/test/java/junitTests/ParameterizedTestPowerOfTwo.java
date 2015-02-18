package junitTests;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Assert;

@RunWith(Parameterized.class)
public class ParameterizedTestPowerOfTwo {

	private final int powerInput;

	// Just the power
	@Parameters()
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 3}, { 6 }, { 13 } });
	}

	// Constructor
	public ParameterizedTestPowerOfTwo(final int powerInput) {
		this.powerInput = powerInput;
	}

	@Test
	public void testUserMApping() {
//		int resNum = PowerOfTwo.CalculatePowerOfTwo(powerInput);
		Assert.assertEquals(Math.pow(2, powerInput), CalculatePowerOfTwo(powerInput), 0);
	}
	
	private int CalculatePowerOfTwo(int power){
		int varNumber = 2;
		for (int i=1;i<power;i++){
			varNumber = varNumber * 2;
		}
		return varNumber;
	}
}
