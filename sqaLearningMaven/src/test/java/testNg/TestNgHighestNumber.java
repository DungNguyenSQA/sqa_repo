package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

import homeExercise.Exe26HighNumberInArray;

public class TestNgHighestNumber {

	public class Exe26JUnitHighestNumberTest {

		/*		Exercise 26: TestNg simple: 
		 *			• Write a program, which takes an array of int 
		 *			and return the highest number from that 
		 *			array. 
		 *			• JUnit Test Cases for above program. 
		 *			• Run the TestNg Test case for above program. 
		*/	

		@Test	
		public void testHighestNumber(){
			System.out.println("Inside testHighestNumber");
			Assert.assertEquals(6,Exe26HighNumberInArray.highestNumber(new int[]{1,3,2,4,6,5,0}));		
		}
	}
	}
