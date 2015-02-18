package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public final class ActionsTest {

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
		driver.get("http://jqueryui.com/slider/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement slider = driver.findElement(By.cssSelector("span.ui-slider.ui-slider-horizontal.ui-widget.ui-widget-content.ui-corner-all"));
		
		new Actions(driver).dragAndDropBy(slider, 100, 0).build().perform();
		
	}
}
