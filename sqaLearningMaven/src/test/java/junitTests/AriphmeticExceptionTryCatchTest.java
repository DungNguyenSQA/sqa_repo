package junitTests;

import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;

public class AriphmeticExceptionTryCatchTest {
    
	private final int NUMBER = 8;

	
	@Test
	public void testDivision(){
		try{

		  int result = NUMBER / 0;
		  Assert.fail("Should not reach this line");
		}catch(Exception e){
			assertTrue(e.getMessage().contains("by zero"));
		}
		
	}

}
