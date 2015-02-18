package webdriver;

import junit.framework.Assert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PerformanceMeasurement {
	private WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new FirefoxDriver();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void testMeasureTimeToLoad(){
		driver.get("http://app.work.com/#login");
		
		//this link for more Measure
		//http://www.w3.org/TR/navigation-timing/

		JavascriptExecutor js = (JavascriptExecutor)driver;
		Long navigationStart = (Long)js.executeScript("return window.performance.timing.navigationStart;");
		Long loadEventEnd = (Long)js.executeScript("return window.performance.timing.loadEventEnd;");
		
		System.out.println("Time end is : "+loadEventEnd);
		System.out.println("Time start is : "+navigationStart);
		System.out.println("Time is : "+(loadEventEnd-navigationStart));
		Assert.assertTrue((loadEventEnd-navigationStart) < 6000);
	}
	
}
