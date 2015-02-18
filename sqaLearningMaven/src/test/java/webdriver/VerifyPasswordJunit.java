package webdriver;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(value=Parameterized.class)
public class VerifyPasswordJunit {
	private String email; 
	private String password; 

	WebDriver driver;
	
	@Before
	public void setup(){
		driver = new FirefoxDriver();
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	public VerifyPasswordJunit(String oper1, String oper2){
		this.email = oper1;
		this.password = oper2;
	}
	
	@Parameters(name= "index - {index}, inputs are {0} and {1}")
	public static Collection<String[]> getAddData(){
		String[][] dataArr = null;
		dataArr = new String[][]{		
			    {"affhlhf@lfddsd.com","ufafuf"},
			    {"kdjhfldf@ldfh.com","kudfus"},
			    {"dflhdshfs@lhdf.com","gfdffds"}
	  	};
		List<String[]> intArrList = Arrays.asList(dataArr);
		return intArrList;
	}

//	@Test
//	public void testResetPasswordMessage(){
	@Test												//Added for exe 2/14/15
	public void testResetPasswordMessage() {		//Added for exe 2/14/15){
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
