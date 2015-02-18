package junitTests;

import java.util.ArrayList;

import org.junit.Test;

public class testIndexOutOfBoundExceptionWithExpected {

	@Test(expected=IndexOutOfBoundsException.class)
//	@Test(expected=InterruptedException.class)
	public void empty(){
		new ArrayList<Object>().get(0);
	}
}
