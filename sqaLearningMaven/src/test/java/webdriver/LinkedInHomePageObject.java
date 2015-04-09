package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedInHomePageObject {
	
	private WebDriver driver;
	
	@FindBy(css="a.forgot-pwd")
	private WebElement forgotpwdLink;
	
	@FindBy(id="session_key-login")
	private WebElement session_keyloginInput;
	
	@FindBy(id="session_password-login")
	private WebElement session_passwordloginInput;
	
	@FindBy(id="signin")
	private WebElement signinBtn;

	@FindBy(id="firstName-coldRegistrationForm")
	private WebElement firstNamecoldRegistrationFormInput;
	
	@FindBy(id="lastName-coldRegistrationForm")
	private WebElement lastNamecoldRegistrationFormInput;
	
	@FindBy(id="email-coldRegistrationForm")
	private WebElement emailcoldRegistrationFormInput;
	
	@FindBy(id="password-coldRegistrationForm")
	private WebElement passwordcoldRegistrationFormInput;
	
	@FindBy(id="btn-submit")
	private WebElement btnsubmitBtn;
	
	@FindBy(id="first")
	private WebElement firstInput;
	
	@FindBy(id="last")
	private WebElement lastInput;
	
	@FindBy(name="search")
	private WebElement searchBtn;
	
	public LinkedInHomePageObject openLinkedInHomePageObject(){
		driver.get("https://www.linkedin.com/");
		return this;
	}
	
	public LinkedInHomePageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public LinkedInResetPwdPageObject clickOnForgotPwd(){
		forgotpwdLink.click();
		return PageFactory.initElements(driver,  LinkedInResetPwdPageObject.class);
	}
	
	public LinkedInHomePageObject enterSession_keylogin(){
		session_keyloginInput.sendKeys("fhaldfakjfhs@att.com");
		return this;
	}
	
	public LinkedInHomePageObject enterSession_passwordlogin(){
		session_passwordloginInput.sendKeys("dgfjdgdfdfal");
		return this;
	}
	
	public LinkedInLogonSubmit clickOnSignin(){
		signinBtn.click();
		return PageFactory.initElements(driver, LinkedInLogonSubmit.class);
	}
	
	public LinkedInHomePageObject enterFirstNamecoldRegistrationForm(){
		firstNamecoldRegistrationFormInput.sendKeys("fdxgfgfflga");
		return this;
	}
	
	public LinkedInHomePageObject enterLastNamecoldRegistrationForm(){
		lastNamecoldRegistrationFormInput.sendKeys("hdfjhfdsf");
		return this;
	}
	
	public LinkedInHomePageObject enterEmailcoldRegistrationForm(){
		emailcoldRegistrationFormInput.sendKeys("fhgaljf@lkfal.com");
		return this;
	}
	
	public LinkedInHomePageObject enterPasswordcoldRegistrationForm(){
		passwordcoldRegistrationFormInput.sendKeys("fsfafar");
		return this;
	}
	
	public LinkedInJoinCreatePageObject clickOnbtnsubmit(){
		btnsubmitBtn.click();
		return PageFactory.initElements(driver, LinkedInJoinCreatePageObject.class);
	}
}
