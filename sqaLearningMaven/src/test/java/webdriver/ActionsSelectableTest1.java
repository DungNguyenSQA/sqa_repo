package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsSelectableTest1 {

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
	public void testActionsSelectable(){
		driver.get("http://jqueryui.com/selectable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		List<WebElement> selectable = driver.findElements(By.cssSelector("ol#selectable *"));
		
		new Actions(driver).clickAndHold(selectable.get(0)).build().perform();
		new Actions(driver).moveToElement(selectable.get(3)).build().perform();
		new Actions(driver).release().build().perform();
	}
}
