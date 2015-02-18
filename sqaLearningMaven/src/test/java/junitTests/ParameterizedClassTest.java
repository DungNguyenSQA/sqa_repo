package junitTests;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Assert;

@RunWith(Parameterized.class)
public class ParameterizedClassTest {

	private final int input;
	private final int resultExpected;

	@Parameters()
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 1, 2 }, { 4, 16 }, { 5, 25 } });
	}

	// Constructor is initialized with one set of parameters everytime
	public ParameterizedClassTest(final int input, final int result) {
		this.input = input;
		this.resultExpected = result;
	}

	@Test
	public void testUserMApping() {
		Assert.assertEquals(resultExpected, input * input);
	}

}
