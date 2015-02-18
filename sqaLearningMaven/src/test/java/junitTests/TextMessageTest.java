package junitTests;

import org.junit.Test;
import org.testng.Assert;

public class TextMessageTest {

	@Test
	public void testMessText(){
		String varText = "abcd";
		System.out.println(varText);		
		Assert.assertEquals("abcd",varText);	
	}
	
	//This code is not good : the variable must be final
	//because someone can do that:
//	public void testMessText(){
//		String varText = "abcd";
//		vartext = "abcd" + "wrong!!!";
//		System.out.println(varText);		
//		Assert.assertEquals("abcd",varText);	
//	}
//
//	Nor this:
//	public class TextMessageTest {
//		String varText = "abcd";
//	
//		@Test
//		public void testMessText(){
//			System.out.println(varText);		
//			Assert.assertEquals("abcd",varText);	
//		}
//	}
//
//	Must be like this:
//	public class TextMessageTest {
//		final String varText = "abcd";	
//
//		@Test
//		public void testMessText(){
//			System.out.println(varText);		
//			Assert.assertEquals("abcd",varText);	
//		}
	
	
	
}
