package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public final class SourceOnIETest {
		private WebDriver driver;
		
		@BeforeMethod
		public void setup(){
//			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Drivers\\IEDriverServer.exe");
			//driver = new InternetExplorerDriver();
//			System.setProperty("webdriver.ie.driver", "C:\\Users\\Admin\\Downloads\\IEDriverServer_x64_2.44.0\\IEDriverServer.exe");
//			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//			driver = new InternetExplorerDriver(capabilities);
//			driver.manage().window().maximize();
						
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Admin\\Downloads\\IEDriverServer_x64_2.44.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get("https://www.google.com/webhp?hl=en");
//			driver.get("http://www.bing.com/search?q=bing&form=IE11TR&src=IE11TR&pc=LNJB");
		}
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		@Test
		public void testGoogleSearchOfFF(){
			driver.findElement(By.id("gbqfq")).sendKeys("Seafood city");
//			WebElement text = driver.findElement(By.name("q"));
//			text.sendKeys("Seafood city");
//			text.submit();
			driver.findElement(By.id("gbqfq")).click();
			//Need time out for response
//			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.partialLinkText("Yelp")).click();
//				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Assert.assertTrue(driver.findElement(By.linkText("Yelp")).isDisplayed());
		}
	}
