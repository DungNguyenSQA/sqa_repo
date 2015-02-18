package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public final class VerifyPassword {
	private WebDriver driver;

	@BeforeMethod
	public void setup(){
		driver = new FirefoxDriver();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	//Reset password exe on 2/14/15
	 @DataProvider(name = "email")
	 public Object[][] createData() {
	  return new Object[][] {
	    {"affhlhf@lfddsd.com","ufafuf"},
	    {"kdjhfldf@ldfh.com","kudfus"},
	    {"dflhdshfs@lhdf.com","gfdffds"}
	  	};
	 }	 
	//End exe on 2/14/15

//	@Test
//	public void testResetPasswordMessage(){
	@Test(dataProvider = "email")												//Added for exe 2/14/15
	public void testResetPasswordMessage(String email, String password) {		//Added for exe 2/14/15){
		final String partialLinkText = "Forgot Password";
//		final String email = "uhashf@khf.com";									//Added for exe 2/14/15)
//		final String passWord = "kjaslkjf";										//Added for exe 2/14/15)
		
		//Wait for 20sec 
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("https://app.work.com/#login");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(partialLinkText)));

		driver.findElement(By.id("10f609783b815858")).sendKeys(email);
//		driver.findElement(By.id("10f6097849fcde43")).sendKeys(passWord);
		driver.findElement(By.id("10f609781286c67a")).sendKeys(password);
				
		driver.findElement(By.id("10f60978316c0ffb")).click();
		
		//Use getTextFromElement to check the message verify email, password not found...
		Assert.assertTrue(driver.findElement(By.id("10f6097864cda4c2")).isDisplayed());
	}
}
