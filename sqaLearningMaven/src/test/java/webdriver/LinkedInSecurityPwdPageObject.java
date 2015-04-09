package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedInSecurityPwdPageObject {
	
	private WebDriver driver;
	
	@FindBy(id="recaptcha_response_field")
	private WebElement recaptcha_response_fieldInput;
	
	@FindBy(css="input.btn-primary")
	private WebElement btnprimaryBtn;
	
	@FindBy(id="li-logo")
	private WebElement lilogoText;
	
	public LinkedInSecurityPwdPageObject(WebDriver driver){
		this.driver = driver;
	}
	
	public LinkedInSecurityPwdPageObject clickPrimary(){
		recaptcha_response_fieldInput.sendKeys("elsfart");
		btnprimaryBtn.click();
		return this;
	}
	
	public LinkedInHomePageObject clicklilogo(){
		lilogoText.click();
		return PageFactory.initElements(driver, LinkedInHomePageObject.class);
	}
}
