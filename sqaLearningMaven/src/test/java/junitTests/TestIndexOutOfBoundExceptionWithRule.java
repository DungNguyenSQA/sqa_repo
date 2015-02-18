package junitTests;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestIndexOutOfBoundExceptionWithRule {

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testOutOfBoundExc() throws IndexOutOfBoundsException {
		int[] varArr = new int[1];
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Index 3 size 2");
		int intVar = varArr[3];
		System.out.println("Passed");
	}
}