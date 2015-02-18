package junitTests;


import homeExercise.Exercise18Circle;
import homeExercise.Exercise18Shape;
import homeExercise.Exercise18Triangle;

import org.junit.Assert;
import org.junit.Test;

public class TestExer24ShapeTest {	
	@Test
	public void testCircleArea(){
		Exercise18Circle cir = new Exercise18Circle("myCir",5);
		Assert.assertEquals(79,cir.getArea(),1);
	}
	
	@Test	
	public void testTriangleArea(){
		//Name, base, height
		Exercise18Shape tr = new Exercise18Triangle("myTriange",2,2);
		Assert.assertEquals(2,tr.getArea(),0);
	}
}
