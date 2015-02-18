package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PhantomjsTest {

	public final class SearchOnFFTest {
		private WebDriver driver;
		
		//This class do not work, need to load an older Phantomjs jar file
		
		@BeforeMethod
		public void setup(){
			Capabilities caps = new DesiredCapabilities();
			  ((DesiredCapabilities) caps).setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
					  "C:\\Users\\Admin\\Downloads\\phantomjs-2.0.0-windows\\phantomjs-2.0.0-windows\\bin\\phantomjs.exe");
			 driver = new PhantomJSDriver(caps);
		}
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		@Test
		public void testGoogleSearchOfFF(){
			driver.get("https://www.google.com/webhp?hl=en");
			driver.findElement(By.id("gbqfq")).sendKeys("Seafood city");
			driver.findElement(By.id("gbqfb")).click();
			//Need time out for response
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.partialLinkText("Yelp")).click();
//			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Assert.assertTrue(driver.findElement(By.linkText("Yelp")).isDisplayed());
		}
	}}
