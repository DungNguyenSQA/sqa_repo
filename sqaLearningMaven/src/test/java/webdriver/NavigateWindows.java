package webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigateWindows {
	private WebDriver driver;

	@BeforeMethod
	public void setup(){
		driver = new FirefoxDriver();
		driver.get("https://app.work.com/#login");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void testSwitchWindows(){
//		List<String> --> driver.getWindowHandles();
//		driver.switchToWindow(<retrieve window handle>);
		
		driver.findElement(By.id("10f6097856296c02")).click();
		
		List<String> listWindows = new ArrayList<String>();
		listWindows.addAll(driver.getWindowHandles());
		
		driver.switchTo().window(listWindows.get(0));
		driver.close();
		
		driver.switchTo().window(listWindows.get(1));
		Assert.assertTrue(driver.findElement(By.className("logo")).isDisplayed());
		
	}
}
