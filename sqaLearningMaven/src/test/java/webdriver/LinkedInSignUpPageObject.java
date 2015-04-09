package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedInSignUpPageObject {
	
	private WebDriver driver;
	
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
	
	@FindBy(id="control_gen_3")
	private WebElement control_gen_3Btn;
	
	public LinkedInSignUpPageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public LinkedInSignUpPageObject enterfirstNamecoldRegistrationForm(){
		firstNamecoldRegistrationFormInput.sendKeys("kjfgefdsfffd");
		return this;
	}
	
	public LinkedInSignUpPageObject enterlastNamecoldRegistrationForm(){
		lastNamecoldRegistrationFormInput.sendKeys("gsgfdvgkhdald");
		return this;
	}
	
	public LinkedInSignUpPageObject enteremailcoldRegistrationForm(){
		emailcoldRegistrationFormInput.sendKeys("fkjdshflvvxvsf@hjfvzg.com");
		return this;
	}
	
	public LinkedInSignUpPageObject enterpasswordcoldRegistrationForm(){
		passwordcoldRegistrationFormInput.sendKeys("gjhdfdfjda");
		return this;
	}
	
	public LinkedInBuildProfilePageObject clickOnBtnsubmit(){
		btnsubmitBtn.click();
		return PageFactory.initElements(driver, LinkedInBuildProfilePageObject.class);
	}
	
	public LinkedInSignUpPageObject clickOncontrol_gen_3Btn(){
		control_gen_3Btn.click();
		return this;
	}
}
