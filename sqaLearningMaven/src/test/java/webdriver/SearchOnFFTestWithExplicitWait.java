package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public final class SearchOnFFTestWithExplicitWait {
		private WebDriver driver;
		
		@BeforeMethod
		public void setup(){
			driver = new FirefoxDriver();
			driver.get("https://www.google.com/webhp?hl=en");
		}
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		@Test
		public void testGoogleSearchOfFF(){
			//Wait for 10sec for EACH ExpectedConditions class 
			WebDriverWait wait = new WebDriverWait(driver,10);
			
			driver.findElement(By.id("gbqfq")).sendKeys("Seafood city");
			driver.findElement(By.id("gbqfb")).click();
			//Need time out for response
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gbqfq")));
//			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.partialLinkText("Yelp")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Yelp")));
//			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			Assert.assertTrue(driver.findElement(By.linkText("Yelp")).isDisplayed());
		}
	}
