package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RyppleNetflixRegistration {

	private WebDriver driver;
	
	@BeforeMethod
	private void setup(){
		driver = new FirefoxDriver();
	}
	
	@AfterMethod
	private void tearDown(){
		driver.quit();
	}
	
	@Test(invocationCount = 5)
	public void testNetflixRegistration(){
		NetflixHomePageObject NetflixHomePageObj = PageFactory.initElements(driver, NetflixHomePageObject.class);
		NetflixHomePageObj.openNetflixHomePage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		NetflixHomePageObj.clickOnStartBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		AccountCreationPageObject NetflixAccountPageObj = PageFactory.initElements(driver, AccountCreationPageObject.class);
		NetflixAccountPageObj.clickOnContinue();
		NetflixAccountPageObj.createAccount();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		CreditCardPageObject NetflixCCPageObj = PageFactory.initElements(driver, CreditCardPageObject.class);
		NetflixCCPageObj.clickOnCreditCardSection();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		NetflixCCPageObj.enterFirstName();
		NetflixCCPageObj.enterLastName();
		NetflixCCPageObj.enterCreditCard();
		NetflixCCPageObj.enterZipCode();
		NetflixCCPageObj.selectExpirationMonth();
		NetflixCCPageObj.selectExpirationYear();
		NetflixCCPageObj.enterSecurityCode();
		NetflixCCPageObj.clickOnCheckbox();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		NetflixCCPageObj.clickOnStartMemberShipBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		NetflixCCPageObj.checkErrorMessage();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		NetflixCCPageObj.clickOnSignOutLink();
		
		LogoutPageObjectNetflix logOutPageObject = PageFactory.initElements(driver, LogoutPageObjectNetflix.class);
		
	}
}
