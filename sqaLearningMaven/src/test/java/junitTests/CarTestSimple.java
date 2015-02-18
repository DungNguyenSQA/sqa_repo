package junitTests;

import inheritence.Car;

import org.junit.Assert;
import org.junit.Test;

public class CarTestSimple {
	@Test
	public void testNetflixLogin(){
		//here you will write the code to
		//using selenium // browser.open
		//open browser, do the login and verify success page		
	}
	
	@Test	
	public void testCarEngineCap(){
		//int engineCap, boolean isFourWheel, int maxSpeed, String color, String model
		Car car = new Car();
		car.setEngineCap(3);
		
		int actualCap = car.getEngineCap();
		System.out.println(actualCap);
		Assert.assertEquals(3, actualCap);
	}
	
	@Test	
	public void testConstructors(){
		//int engineCap, boolean isFourWheel, int maxSpeed, String color, String model
		Car car = new Car(3,true,120,"black","vw");		
		Assert.assertEquals("black",car.getColor());
	}
}
