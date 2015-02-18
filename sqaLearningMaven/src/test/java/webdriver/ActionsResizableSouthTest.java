package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsResizableSouthTest {

	private WebDriver driver;
	
	@BeforeMethod
	private void setup(){
		driver = new FirefoxDriver();
	}
	
	@AfterMethod
	private void teardown(){
		driver.quit();
	}
	
	@Test
	public void ActionsResizableSouth(){
		driver.get("http://jqueryui.com/resizable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement resizable = driver.findElement(By.cssSelector("div.ui-resizable-handle.ui-resizable-s"));
		
		new Actions(driver).dragAndDropBy(resizable, 0, 200).perform();
	}
}
