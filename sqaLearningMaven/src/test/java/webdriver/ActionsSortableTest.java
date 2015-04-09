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

public class ActionsSortableTest {

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
	public void testSortable(){
		driver.get("http://jqueryui.com/sortable/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		List<WebElement> sortable = driver.findElements(By.cssSelector("ul#sortable li"));

		//Get the element E from the list
		new Actions(driver).clickAndHold(sortable.get(1)).build().perform();
		//Save the row where we want to move the E element
		WebElement webEle = sortable.get(5);
		//Remove that saved element
		sortable.remove(5);
		sortable.remove(6);
		//Put the E element to that row
		new Actions(driver).moveToElement(sortable.get(5)).build().perform();
		//Add the saved element back to the list at the E element previous position
		sortable.add(1, webEle);
		//Rebuild the list
		new Actions(driver).click(sortable.get(6)).build().perform();
		new Actions(driver).release();
				
//		new Actions(driver).clickAndHold(sortable.get(0)).moveToElement(sortable.get(3)).click(sortable.get(3)).build().perform();
	}
}
