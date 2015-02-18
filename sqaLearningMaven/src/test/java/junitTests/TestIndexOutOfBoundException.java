package junitTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIndexOutOfBoundException {

	@Test
	public void testOutOfBoundExc(){
		int[] varArr = new int[2];
		
		try{
			int intVar = varArr[3];
			fail();
		}catch(IndexOutOfBoundsException oob){
			System.out.println("in Catch");
		}
	}
}
