package testNg;

import inheritence.Apple;
import inheritence.Fruit;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups={ "functest"})
public class FruitTest {
	Logger log = Logger.getLogger(FruitTest.class);
  	
  public void appleNameTest() {
	  System.out.println("Inside Apple Test");
	  log.info("Inside Apple Test");
	  Fruit fruit = new Apple();
	  Assert.assertEquals(fruit.name(), "Apple");
  }
  
  @Test
  public void fruitNameTest(){
	  System.out.println("Inside Fruit Test");
	  log.info("Inside Fruit Test");
	  Fruit fruit = new Fruit();
	  Assert.assertEquals(fruit.name(), "Fruit");
  }
  
}
