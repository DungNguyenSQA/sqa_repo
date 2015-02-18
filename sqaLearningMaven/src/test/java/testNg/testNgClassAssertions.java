package testNg;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class testNgClassAssertions {

	//test class, methods, +assertion true, false, null, 
	//notnull, same, notsame, equals (2 array)  

	@Test
	public void testNgAssertTrue(){
		testNgClass str = new testNgClass("abcd");
		AssertJUnit.assertTrue(str.getString().equals("abcd"));
	}
	@Test
	public void testNgAssertFalse(){
		testNgClass str = new testNgClass("abcd");
		AssertJUnit.assertFalse(str.getString().equals("ab"));
	}

	@Test
	public void testNgAssertNull(){
		testNgClass str = new testNgClass();
		AssertJUnit.assertNull(str.getString());
	}

	@Test
	public void testNgAssertNotNull(){
		testNgClass str = new testNgClass("cbde");
		AssertJUnit.assertNotNull(str.getString());
	}
	
	@Test
	public void testNgAssertNotSame(){
		testNgClass str1 = new testNgClass("cbde");
		testNgClass str2 = new testNgClass("cbde");
		AssertJUnit.assertNotSame(str1, str2);
	}
	
	@Test
	public void testNgAssertSame(){
		testNgClass str1 = new testNgClass("cbde");
		testNgClass str2 = str1;
		AssertJUnit.assertSame(str1, str2);
	}
	
	@Test
	public void testNgAssertEquals(){
		int[] varArr1 = new int[]{1,2,3};
		int[] varArr2 = new int[]{1,2,3};
		AssertJUnit.assertArrayEquals(varArr1, varArr2);			
	}	
}
