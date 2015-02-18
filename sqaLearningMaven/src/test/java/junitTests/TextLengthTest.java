package junitTests;

import org.junit.Test;
import org.testng.Assert;

public class TextLengthTest {
	final String text = "blah";
	
	@Test
	public void testLength(){
		Assert.assertTrue(text.length() > 0);
		Assert.assertFalse(text.length() == 0);
	}

}
