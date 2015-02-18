package webdriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class NavigateWindowsIE {
		private WebDriver driver;

		@BeforeMethod
		public void setup(){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Admin\\Downloads\\IEDriverServer_x64_2.44.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get("https://app.work.com/#login");
		}
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
		
		@Test
		public void testSwitchWindows(){
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("10f6097856296c02")).click();
			
			List<String> listWindows = new ArrayList<String>();
			listWindows.addAll(driver.getWindowHandles());
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.switchTo().window(listWindows.get(0));
			driver.close();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.switchTo().window(listWindows.get(1));
			Assert.assertTrue(driver.findElement(By.className("logo")).isDisplayed());
			
		}
}
