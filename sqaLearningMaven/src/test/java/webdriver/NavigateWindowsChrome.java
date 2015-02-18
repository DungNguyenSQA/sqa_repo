package webdriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigateWindowsChrome {
	private WebDriver driver;

	@BeforeMethod
	public void setup(){
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\AppData\\Local\\Temp\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.get("https://app.work.com/#login");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void testSwitchWindows(){
		//Need more time out
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("10f6097856296c02")).click();
		
		List<String> listWindows = new ArrayList<String>();
		listWindows.addAll(driver.getWindowHandles());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().window(listWindows.get(0));
		driver.close();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().window(listWindows.get(1));
		Assert.assertTrue(driver.findElement(By.className("logo")).isDisplayed());
		
	}
}
