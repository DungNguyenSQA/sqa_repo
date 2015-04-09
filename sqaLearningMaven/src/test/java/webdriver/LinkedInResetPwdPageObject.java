package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedInResetPwdPageObject {

	private WebDriver driver;
	
	@FindBy(id="email-requestPasswordReset")
	private WebElement emailrequestPasswordResetInput;
	
	@FindBy(id="request")
	private WebElement requestBtn;
	
	public LinkedInResetPwdPageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public LinkedInSecurityPwdPageObject enterEmail(){
		emailrequestPasswordResetInput.sendKeys("fjafhadsdfadffaddhf@att.com"); 
		requestBtn.click();
		return PageFactory.initElements(driver, LinkedInSecurityPwdPageObject.class);
	}
	
}
