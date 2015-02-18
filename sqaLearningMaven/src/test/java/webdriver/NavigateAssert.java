package webdriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigateAssert {
	private WebDriver driver;

	@BeforeMethod
	public void setup(){
		driver = new FirefoxDriver();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void testSwitchWindows(){
		
		driver.get("https://app.work.com/#login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Forgot Password?")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		This won't work because compound text, because by.className
//		driver.findElement(By.className("gwt-TextBox GPWX50PCPMD GPWX50PCNMD")).sendKeys("fhakhflis@kdfh.com");
//		driver.findElement(By.className("gwt-TextBox.GPWX50PCPMD.GPWX50PCNMD")).click();
		
		driver.findElement(By.cssSelector("input.gwt-TextBox.GPWX50PCPMD.GPWX50PCNMD")).sendKeys("fhakhflis@kdfh.com");		
		driver.findElement(By.cssSelector("button.GPWX50PCPL.GPWX50PCLMD")).click();

		Assert.assertTrue(driver.findElement(By.className("GPWX50PCEND")).isDisplayed());
	}
}
