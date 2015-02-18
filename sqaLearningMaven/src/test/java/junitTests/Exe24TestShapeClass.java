package junitTests;

import org.junit.Assert;
import org.junit.Test;

import homeExercise.Exercise18Circle;
import homeExercise.Exercise18Shape;
import homeExercise.Exercise18Triangle;

public class Exe24TestShapeClass {

/*	Exercise 24 : JUnit 
 *	1.Write a test case to test Shape class 
 *	2.Write test case to test the area of a circle with 
 *	radius 5. 
 *	3.Write a test case to test the area of triangle 
 *	with height = 2 and width=2. 
*/
	double delta = .01;
	
	@Test
	public void testCircle(){
		System.out.println("@Test Circle");
		Exercise18Circle myCircle = new Exercise18Circle("blueCircle",5);
		Assert.assertEquals("blueCircle",myCircle.getName());
		Assert.assertEquals(5,myCircle.getRadius(),delta);
		Assert.assertEquals(78.5,myCircle.getArea(),delta);
	}
	
	@Test
	public void testTriangle(){
		System.out.println("@Test Triangle");
		Exercise18Triangle myTriangle = new Exercise18Triangle("redTriangle",2,2);
		Assert.assertEquals("redTriangle",myTriangle.getName());
		Assert.assertEquals(2,myTriangle.getBase(),delta);
		Assert.assertEquals(2,myTriangle.getHeight(),delta);
		Assert.assertEquals(2,myTriangle.getArea(),delta);		
	}
}
