package junitTests;

import org.junit.Assert;
import org.junit.Test;

public class LenghtTextTest {
	final String varText = "abcd";
	
	@Test
	public void testLenghMessText(){
		System.out.println(varText);		
		Assert.assertTrue((varText.length()>0));
		
		//varText = null;
		Assert.assertFalse((varText.length()==0));
	}
		
}
