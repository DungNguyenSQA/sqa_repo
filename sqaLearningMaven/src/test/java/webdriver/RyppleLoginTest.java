package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RyppleLoginTest {

	private WebDriver driver;
	
	@BeforeMethod
	private void setup(){
		driver = new FirefoxDriver();
	}
	
	@AfterMethod
	private void tearDown(){
		driver.quit();
	}
	
	@Test
	public void testLogin_NegativeTC(){
		LoginPageObject loginObj = PageFactory.initElements(driver, LoginPageObject.class);
		loginObj.navigateToLoginPage();
		try{
			loginObj.loginWithInvalidCredentials();
		}catch(Exception e){
			e.printStackTrace();
		}
		loginObj.checkErrorMessage();
	}
	
}
