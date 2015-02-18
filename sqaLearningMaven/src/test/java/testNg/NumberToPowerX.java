package testNg;

import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NumberToPowerX {
	 @DataProvider(name = "power")
	 public Object[][] createData1() {
	  return new Object[][] {
	    {1},
	    {3},
	    {6}
	  };
	 }
	
	 @Test(dataProvider = "power")
	 public void test(int num){
		 int res = 1;
		 int base = 2;
		 for(int i=0; i < num; i++){
			 res = res*base;
		 }
		 
		AssertJUnit.assertEquals(res,Math.round(Math.pow(2,num)));
	 }

}
