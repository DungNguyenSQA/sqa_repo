package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RyppleLinkedIn {

	private WebDriver driver;
	
	@BeforeMethod
	private void setup(){
		driver = new FirefoxDriver();
	}
	
	@AfterMethod
	private void teardown(){
		driver.quit();
	}
	
	@Test(invocationCount = 1)
	public void testLinkedIn(){
		
		//Forgot Password
		LinkedInHomePageObject LinkedInHomePageObj = PageFactory.initElements(driver, LinkedInHomePageObject.class);
		LinkedInHomePageObj.openLinkedInHomePageObject();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LinkedInHomePageObj.clickOnForgotPwd();
		
		LinkedInResetPwdPageObject LinkedInResetPwdPageObj = PageFactory.initElements(driver, LinkedInResetPwdPageObject.class);
		LinkedInResetPwdPageObj.enterEmail();
		
		LinkedInSecurityPwdPageObject LinkedInSecurityPwdPageObj = PageFactory.initElements(driver, LinkedInSecurityPwdPageObject.class);
		LinkedInSecurityPwdPageObj.clickPrimary();
		
		LinkedInSecurityPwdPageObj.clickPrimary();
		LinkedInSecurityPwdPageObj.clicklilogo();
		
		//sign in account
		LinkedInHomePageObj.enterSession_keylogin();
		LinkedInHomePageObj.enterSession_passwordlogin();
		
		LinkedInHomePageObj.clickOnSignin();
		LinkedInLogonSubmit LinkedInLogonSubmitPageObj = PageFactory.initElements(driver, LinkedInLogonSubmit.class);
		LinkedInLogonSubmitPageObj.enterSession_passwordInput();
		LinkedInLogonSubmitPageObj.clickOnsignin();
		
		LinkedInLogonSubmitPageObj.enterSession_passwordInput();
		LinkedInLogonSubmitPageObj.clickOnsignin();
		LinkedInLogonSubmitPageObj.clickOnjoinnowLink();
		
		try {
			Assert.assertTrue(driver.getPageSource().contains("Make the most of your professional life"));
			LinkedInConsumerLoginPageObject LinkedInConsumerLoginPageObj = PageFactory.initElements(driver, LinkedInConsumerLoginPageObject.class);
			LinkedInConsumerLoginPageObj.enterFirstName();
			LinkedInConsumerLoginPageObj.enterLastname();
			LinkedInConsumerLoginPageObj.enterJoinEmail();
			LinkedInConsumerLoginPageObj.enterJoinPassword();
			LinkedInConsumerLoginPageObj.clickOnjoinNow();
			
		}catch(AssertionError Ae){
			LinkedInSignUpPageObject LinkedInSignUpPageObj = PageFactory.initElements(driver, LinkedInSignUpPageObject.class);			
			LinkedInSignUpPageObj.enterfirstNamecoldRegistrationForm();
			LinkedInSignUpPageObj.enterlastNamecoldRegistrationForm();
			LinkedInSignUpPageObj.enteremailcoldRegistrationForm();
			LinkedInSignUpPageObj.enterpasswordcoldRegistrationForm();
			
			LinkedInSignUpPageObj.clickOnBtnsubmit();
		}
		
		try {
			Assert.assertTrue(driver.getPageSource().contains("Please enter your phone number and we'll send you a "));
			LinkedInJoinCreatePageObject LinkedInJoinCreatePageObj = PageFactory.initElements(driver, LinkedInJoinCreatePageObject.class);
			LinkedInJoinCreatePageObj.clickOnlilogo();
		}catch (AssertionError Ae){
			LinkedInBuildProfilePageObject LinkedInBuildProfilePageObj = PageFactory.initElements(driver, LinkedInBuildProfilePageObject.class);
			LinkedInBuildProfilePageObj.clickOnCountryCodelocationemployedProfileForm();
			LinkedInBuildProfilePageObj.enterPostalCodelocationemployedProfileForm();
			LinkedInBuildProfilePageObj.clickOnlookingbtn();
			LinkedInBuildProfilePageObj.enterWorkCompanyTitlelookingProfileForm();
			LinkedInBuildProfilePageObj.clickOnselfEmployedemployeeCompanylookingProfileForm();
			LinkedInBuildProfilePageObj.companyNamecompanyInfoemployeeCompanylookingProfileForm();
			LinkedInBuildProfilePageObj.industryChooseremployeeCompanylookingProfileForm();
			LinkedInBuildProfilePageObj.clickOnstartYearpreviousStartEndlookingProfileForm();
			LinkedInBuildProfilePageObj.clickOnendYearpreviousStartEndlookingProfileForm();
			LinkedInBuildProfilePageObj.clickOnlookingbtnsubmit();			
		}
		
		LinkedInHomePageObj = PageFactory.initElements(driver, LinkedInHomePageObject.class);
		LinkedInHomePageObj.enterFirstNamecoldRegistrationForm();
		LinkedInHomePageObj.enterLastNamecoldRegistrationForm();
		LinkedInHomePageObj.enterEmailcoldRegistrationForm();
		LinkedInHomePageObj.enterPasswordcoldRegistrationForm();
		LinkedInHomePageObj.clickOnbtnsubmit();
		
		LinkedInJoinCreatePageObject LinkedInJoinCreatePageObj = PageFactory.initElements(driver, LinkedInJoinCreatePageObject.class);
		LinkedInJoinCreatePageObj.enterphoneNumberphone_challenge();
		LinkedInJoinCreatePageObj.clickOnCta_btnprimary();
		
		LinkedInJoinCreatePageObj.enterPinVerificationForm_pinParampin_verification();
		LinkedInJoinCreatePageObj.clickOnCta_btnprimary();
		LinkedInJoinCreatePageObj.clickOnlilogo();
		

//		try {
//			Assert.assertTrue(driver.getPageSource().contains("Please enter a valid email address"));
//		}catch (AssertionError ae){
//			teardown();
//		}
//		LinkedInResetPwdPageObj.enterEmail();
		
	}
}