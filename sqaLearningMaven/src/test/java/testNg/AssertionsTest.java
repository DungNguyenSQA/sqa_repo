package testNg;

import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertNull;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class AssertionsTest {

@Test
public void testAssertTrue(){
		ObjectOne one  = new ObjectOne("Hello, World!");	
		AssertJUnit.assertTrue("error message", one.getStringValue().contains("World"));
	}

@Test
public void testAssertFalse(){
	ObjectTwo two = new ObjectTwo("Hello, World!");
	AssertJUnit.assertFalse(two.getStringValue().contains("hello"));	
}

@Test
public void testAssertNotNull(){
	ObjectTwo two = new ObjectTwo("Hello, World!");
	assertNotNull(two.getStringValue());
}

@Test
public void testAssertNull(){
	ObjectTwo two = new ObjectTwo();
	assertNull(two.getStringValue());
}

@Test
public void testAssertEquals1(){
	ObjectTwo one = new ObjectTwo("Hi!");
	ObjectTwo two = new ObjectTwo("Hi!");
	
	AssertJUnit.assertEquals(one.getStringValue(), two.getStringValue());
}

@Test
public void testAssertEquals(){
	int[] A = {1, 2, 3};
	int[] B = {1, 2, 3};
	
	AssertJUnit.assertArrayEquals(A, B);
}

@Test
public void testAssertSame(){
		ObjectTwo one = new ObjectTwo();
		ObjectTwo two = new ObjectTwo();
		one = two;
		
		AssertJUnit.assertSame(one, two);
}

@Test
public void testAssertNotSame(){
	ObjectOne one = new ObjectOne();
	ObjectTwo two = new ObjectTwo();
	
	Assert.assertNotSame(one, two);
}

/*@Test
public void testFail(){
	Assert.fail();
}
*/
}
