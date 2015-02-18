package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsDraggableTest {

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
	public void testSliding(){
		driver.get("http://jqueryui.com/draggable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		
		new Actions(driver).dragAndDropBy(draggable, 100, 0).perform();
	}
}
